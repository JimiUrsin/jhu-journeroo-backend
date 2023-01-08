CREATE TABLE journeys (
    id INT GENERATED ALWAYS AS IDENTITY,
    departureTimestamp TIMESTAMP NOT NULL,
    returnTimestamp TIMESTAMP NOT NULL,
    departureStationId INT NOT NULL,
    departureStationName VARCHAR(64) NOT NULL,
    returnStationId INT NOT NULL,
    returnStationName VARCHAR(64) NOT NULL,
    distance FLOAT4 NOT NULL,
    duration FLOAT4 NOT NULL,

    CHECK(departureTimestamp < returnTimestamp),
    CHECK(distance >= 10),
    CHECK(duration >= 10)
);
