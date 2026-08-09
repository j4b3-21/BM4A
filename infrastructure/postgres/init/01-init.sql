CREATE USER keycloak WITH PASSWORD 'keycloak';
CREATE USER openfga WITH PASSWORD 'openfga';
CREATE USER platform WITH PASSWORD 'platform';

CREATE DATABASE keycloak OWNER keycloak;
CREATE DATABASE openfga OWNER openfga;
CREATE DATABASE platform OWNER platform;
