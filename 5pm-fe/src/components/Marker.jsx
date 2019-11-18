import React, { Component } from 'react';
import { Circle, Tooltip } from 'react-leaflet';

class Marker extends Component {
    state = {
        position: [this.props.lat, this.props.lon],
        name: this.props.name,
        address: this.props.address,
        polutV1: this.props.polutV1,
        polutV2: this.props.polutV2,
        polutV3: this.props.polutV3,
        polutV4: this.props.polutV4
    };

    calculatePercentage() {
        const percentage = Math.round(100 - (this.state.polutV4 / (this.state.polutV1 + this.state.polutV2 + this.state.polutV3)) * 100);
        return percentage;
    }

    calculateRadius() {
        const radius = this.calculatePercentage() + 2;
        return radius;
    }

    render() {
        return (
            <Circle center={this.state.position} radius={this.calculateRadius()} color="grey">
                <Tooltip direction="right" offset={[-8, -2]} opacity={1}>
                    <span>{this.state.name}</span>
                    <hr />
                    <span>{this.state.address}</span>
                    <hr />
                    <span>{this.calculatePercentage()}% non green energy.</span>
                </Tooltip>
            </Circle>
        );
    }
}

export default Marker;
