import React from 'react';
import { Map, TileLayer } from 'react-leaflet';
import Marker from './Marker';
import axios from 'axios';

export default class MapComponent extends React.Component {
    state = {
        zoom: 14,
        defaultPosition: [55.694, 21.1957],
        organizations: []
    };

    componentDidMount() {
        const url = 'http://localhost/organizations';

        axios
            .get(url)
            .then(response => {
                this.setState({ organizations: response.data });
            })
            .catch(error => {
                console.log(error);
            });
    }

    render() {
        const position = this.state.defaultPosition;

        return (
            <div className=".leaflet-container">
                <Map center={position} zoom={this.state.zoom}>
                    <TileLayer
                        attribution='&amp;copy <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    {this.state.organizations.map(organization => (
                        <Marker
                            key={organization.org}
                            lat={organization.lat}
                            lon={organization.lon}
                            name={organization.org_name}
                            address={organization.org_address}
                            polutV1={organization.organizationMeasurements.scope1tco2e}
                            polutV2={organization.organizationMeasurements.scope2tco2e}
                            polutV3={organization.organizationMeasurements.scope3tco2e}
                            polutV4={organization.organizationMeasurements.renewabletco2e}
                        />
                    ))}
                </Map>
            </div>
        );
    }
}
