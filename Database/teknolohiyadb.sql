-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 22, 2023 at 05:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teknolohiyadb`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_account_table`
--

CREATE TABLE `user_account_table` (
  `ID` int(11) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Firstname` varchar(50) NOT NULL,
  `GENDER` varchar(50) NOT NULL,
  `Phone_Number` varchar(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_account_table`
--

INSERT INTO `user_account_table` (`ID`, `Lastname`, `Firstname`, `GENDER`, `Phone_Number`, `Username`, `Password`) VALUES
(1, 'Jacobe', 'John Carlo', 'Male', '09215820554', 'jacobe', 'jacobe143'),
(2, 'Barandino', 'Kimberly', 'Female', '09123456789', 'kimmy', 'barandino143');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_account_table`
--
ALTER TABLE `user_account_table`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Username` (`Username`,`Password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_account_table`
--
ALTER TABLE `user_account_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
