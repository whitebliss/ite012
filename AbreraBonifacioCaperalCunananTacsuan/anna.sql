-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 30, 2020 at 07:17 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `anna`
--
CREATE DATABASE IF NOT EXISTS `anna` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `anna`;

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `type_id` tinyint(2) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `c_num` int(10) NOT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `s_num` int(10) DEFAULT NULL,
  `program` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`),
  KEY `type_id_fk` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`user_id`, `type_id`, `email`, `password`, `firstname`, `lastname`, `c_num`, `subject`, `specialization`, `s_num`, `program`) VALUES
(1, 1, 'anna@sample.com', 'mabaitnatao', 'Anna Jessica', 'Cunanan', 123321123, 'Subject 1', 'Milktea', NULL, NULL),
(2, 1, 'asdf', 'asdfasd', 'fsadfasdfasd', 'fasdf', 12312, 'asdfasdfasdfas', 'sadfasdf', NULL, NULL),
(3, 1, 'rtregdszfg', 's231', '31413', '2412', 3, '2314', '123e', NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
