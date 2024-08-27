use budgetride;

set global sql_mode='';
-- SET FOREIGN_KEY_CHECKS = 0; 
-- ------------------------------------------------------
-- --  05-06-2023 yacine belaifa 
-- --  comment: added create Account and client tables 
-- -------------------------------------------------------


--- UNCOMMENT TO REFRESH THE DATA BASE

drop table if exists Vehicle;
drop table if exists Address;
drop table if exists Ride;
drop table if exists Client;
drop table if exists Driver;
drop table if exists Account;


CREATE TABLE if not exists Account (
	accountId int NOT NULL AUTO_INCREMENT,
    firstname varchar(100) not null,
    lastname varchar(100) not null,
    email varchar(100) not null,
    phone varchar(30) not null,
    type varchar(6) not null,
    dateofbirth varchar(10) ,
    sex varchar(1),
    country varchar(20),
    PRIMARY KEY (accountId)
);

CREATE TABLE if not exists Client (
	-- clientId int NOT NULL AUTO_INCREMENT,
    numberOfMilesTravelled int,
    accountId int NOT NULL ,  
    PRIMARY KEY (accountId),
   FOREIGN KEY (accountId) REFERENCES Account(accountId)
);

---- Justin Hughes, Added driver, Vehicle and Ride Tables, 5-14-2023

CREATE TABLE if not exists Driver (

accountId int not null ,
status varchar(30),
vehicleTypeInService varchar(25),
PRIMARY KEY (accountId),
FOREIGN KEY (accountId) REFERENCES Account(accountId)
-- FOREIGN KEY (vehicleId) REFERENCES Vehicle(vehicleId)


);

CREATE TABLE if not exists Vehicle (
	vehicleId int NOT NULL AUTO_INCREMENT,
    driverId int not null,
    plateNumber varchar(7) not null,
    vehicleType varchar(20) not null,
    numberOfSeats int not null,
    PRIMARY KEY (vehicleId),
    FOREIGN KEY (driverId) references Driver(accountId)
);

CREATE TABLE if not exists Ride (
rideId int NOT NULL AUTO_INCREMENT,
clientId int not null,
driverId int not null,
distanceTravelled int not null,
comments varchar(500),
cost varchar(20) ,
date DATETIME not null,
PRIMARY KEY (rideId),
FOREIGN KEY (clientId) references Client(accountId),
FOREIGN KEY (driverId) references Driver(accountId)
);

---- Yacine Belaifa, Added Address table 2023-10-08

CREATE TABLE if not exists Address (
	addressId int NOT NULL AUTO_INCREMENT,
	rideId int NOT NULL,
    street varchar(255) not null,
    streetNumber varchar(10) not null,
    city varchar(100) not null,
    postalCode varchar(10)  not null,
    provinceOrState varchar(2),
    addressType varchar(40),
    country varchar(10)  not null,
    PRIMARY KEY (addressId),
    FOREIGN KEY (rideId) references Ride(rideId)
);


--  ON DELETE NO ACTION
--   ON UPDATE NO ACTION



-- CREATE TABLE if not exists DriverVehicleAssociation (

--     id int NOT NULL AUTO_INCREMENT,
--     driverId int ,
--     vehicleId int, 
--     PRIMARY KEY (id),
--     FOREIGN KEY (driverId) references Driver(accountId),
--     FOREIGN KEY (vehicleId) references Vehicle(vehicleId)


-- );

