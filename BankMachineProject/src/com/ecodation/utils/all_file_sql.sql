use bankproject;

CREATE TABLE `bankproject`.`register` (
  `register_id` INT NOT NULL AUTO_INCREMENT,
  `register_name` VARCHAR(150) NOT NULL,
  `register_surname` VARCHAR(150) NOT NULL,
  `register_email` VARCHAR(150) NOT NULL,
  `register_password` VARCHAR(45) NOT NULL,
  `roles` VARCHAR(45) NULL,
  `creation_date` VARCHAR(45) NULL DEFAULT 'CURRENT_TIMESTAMP',
  PRIMARY KEY (`register_id`));