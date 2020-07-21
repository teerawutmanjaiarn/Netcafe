-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 21, 2020 at 08:21 AM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `netcafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `AdminID` int(20) NOT NULL,
  `UserAdmin` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`AdminID`, `UserAdmin`, `Password`) VALUES
(1, 'gus', '1234'),
(2, 'king', '1234'),
(3, 'queen', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `computers`
--

CREATE TABLE `computers` (
  `ComputerID` int(50) NOT NULL,
  `Monitor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `CPU` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Graphiccard` varchar(100) NOT NULL,
  `Mouse` varchar(100) NOT NULL,
  `Keyboard` varchar(100) NOT NULL,
  `Headphones` varchar(100) NOT NULL,
  `Status` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `computers`
--

INSERT INTO `computers` (`ComputerID`, `Monitor`, `CPU`, `Graphiccard`, `Mouse`, `Keyboard`, `Headphones`, `Status`) VALUES
(1, 'DELL LD-S3220DGF 31.5 VA 144Hz\r\n', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(2, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(3, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(4, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(5, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(6, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(7, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Dilapidated'),
(8, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(9, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(10, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Repair'),
(11, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(12, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(13, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(14, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Repair'),
(15, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(16, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(17, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Dilapidated'),
(18, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(19, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(20, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(21, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(22, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(23, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Dilapidated'),
(24, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(25, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(26, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(27, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(28, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(29, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Available'),
(30, 'DELL LD-S3220DGF 31.5 VA 144Hz', 'INTEL 2066 CORE i9-9980XE 3.0 GHz', 'NVIDIA Geforce GTX 1080', 'FANTECH X16 THOR II Optical Macro Key RGB Gaming Mouse', 'KEYBOARD ASUS ROG STRIX FLARE RGB', 'HEADSET (7.1) FANTECH Captain HG15 RGB Gaming', 'Dilapidated');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `CustomerID` int(100) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `LastName` varchar(25) NOT NULL,
  `Age` int(30) NOT NULL,
  `Tel` varchar(15) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CustomerID`, `Name`, `LastName`, `Age`, `Tel`, `Gender`, `Email`, `Address`) VALUES
(1, 'ธีรวุธ', 'มั่นใจอารย์', 21, '0938377181', 'ชาย', 'teerawutsuthi100@gmail.com', '96 มาตานุสรณ์ บางคอเเหลม\nกรุงเทพ'),
(2, 'ภานุพงษ์', 'เเสงเพ็ชร', 21, '022912965', 'ชาย', 'frong@gmail.com', 'gg well play'),
(3, 'หนูนา', 'บ้านไกล', 30, '012355998', 'หญิง', 'nunaa@hotmail.com', '33 LostAngelist'),
(4, 'นารูโตะ', 'อูสึมากินะ', 15, '0938377181', 'ชาย', 'asdsada', 'asdasd'),
(7, 'นามิ', 'กหฟกฟห', 20, '51145145', 'หญิง', 'dsa555', 'adssaasd'),
(8, 'ไตรภูมิ', 'ปลื้มจิตต์', 25, '0915187399', 'ชาย', 'triphum123@gmail.com', 'อิอิ'),
(9, 'ดกหด', 'ดไำไำ', 223, '1456', 'ชาย', 'qwdqwd', 'qwdqwdqw'),
(10, 'dawadq', 'dqwdq', 30, '2424534', 'ชาย', 'ger', 'weffwe'),
(11, 'eiei', '123456789', 20, 'das', 'หญิง', 'dasdas', 'dsadasd'),
(12, 'dsadsa', 'dsadas', 30, '2121', '-', 'dasasdas', 'dasdas'),
(13, 'cdsvs', 'vdsvds', 20, 'dasdsadas', 'หญิง', 'dqwdqw', 'fewfewgewf'),
(15, 'เเมว', 'เหมียว', 5, '022236965', 'ชาย', 'meaw@gmail.com', 'thailland');

-- --------------------------------------------------------

--
-- Table structure for table `customersid`
--

CREATE TABLE `customersid` (
  `UserID` int(100) NOT NULL,
  `CustomerID` int(20) NOT NULL,
  `User` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customersid`
--

INSERT INTO `customersid` (`UserID`, `CustomerID`, `User`, `Password`) VALUES
(1, 1, 'gues_za123', '4568341a'),
(2, 2, 'gues_suthi', '4568341a'),
(3, 3, 'nuna', 'Bankai123'),
(4, 1, 'teerawutsuthi100', '08954236a'),
(5, 1, 'teerawutsuthi100', '4658341a'),
(6, 4, 'naruto99', '123456789'),
(10, 8, 'phummies', '0915187399'),
(12, 9, 'ddqwdq', 'dqwdqd'),
(13, 10, 'dqwqw', 'dqwdqw'),
(14, 11, 'asdqwfq', 'fqfwerger'),
(15, 12, 'dadsad', 'arqwrqewrqw'),
(16, 13, 'fewfwef', 'wefwefew'),
(18, 15, 'meaw123', '12345678'),
(19, 15, 'meaw888', '33344455');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `OrderID` int(100) NOT NULL,
  `UserID` int(100) DEFAULT NULL,
  `Hour` int(20) NOT NULL,
  `Price` int(100) NOT NULL,
  `OrderDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderID`, `UserID`, `Hour`, `Price`, `OrderDate`) VALUES
(1, 3, 3, 30, '2020-02-26 17:00:00'),
(2, 1, 3, 30, '2020-02-20 17:00:00'),
(10, 1, 3, 30, '2020-02-21 17:00:00'),
(11, 1, 5, 50, '2020-02-21 17:00:00'),
(12, 3, 3, 30, '2020-02-21 17:00:00'),
(13, 1, 3, 30, '2020-02-21 17:00:00'),
(14, 1, 3, 30, '2020-02-21 17:00:00'),
(15, 3, 3, 30, '2020-02-21 17:00:00'),
(16, 1, 2, 20, '2020-02-21 17:00:00'),
(17, 1, 3, 30, '2020-02-21 17:00:00'),
(18, 1, 1, 10, '2020-02-21 17:00:00'),
(19, 1, 2, 20, '2020-02-21 17:00:00'),
(20, 3, 2, 20, '2020-02-21 17:00:00'),
(21, 1, 3, 30, '2020-02-21 17:00:00'),
(22, 1, 2, 20, '2020-02-21 17:00:00'),
(23, NULL, 2, 20, '2020-02-21 17:00:00'),
(24, NULL, 2, 20, '2020-02-21 17:00:00'),
(25, NULL, 2, 20, '2020-02-21 17:00:00'),
(26, 3, 3, 30, '2020-02-22 17:00:00'),
(27, 1, 3, 30, '2020-02-22 17:00:00'),
(28, NULL, 2, 30, '2020-02-22 17:00:00'),
(29, NULL, 1, 15, '2020-02-22 17:00:00'),
(30, 1, 1, 10, '2020-02-22 17:00:00'),
(31, 1, 2, 20, '2020-02-22 17:00:00'),
(32, NULL, 1, 15, '2020-02-22 17:00:00'),
(33, NULL, 1, 15, '2020-02-22 17:00:00'),
(34, 1, 2, 20, '2020-02-22 17:00:00'),
(35, NULL, 1, 15, '2020-02-22 17:00:00'),
(36, NULL, 2, 30, '2020-02-22 17:00:00'),
(37, NULL, 2, 30, '2020-02-22 17:00:00'),
(38, 1, 1, 10, '2020-02-22 17:00:00'),
(39, 3, 2, 20, '2020-02-22 17:00:00'),
(40, 1, 2, 20, '2020-02-22 17:00:00'),
(41, 1, 3, 30, '2020-02-22 17:00:00'),
(42, 1, 1, 10, '2020-02-22 17:00:00'),
(43, 3, 2, 20, '2020-02-22 17:00:00'),
(44, 1, 2, 20, '2020-02-22 17:00:00'),
(45, 1, 3, 30, '2020-02-22 17:00:00'),
(46, 1, 1, 10, '2020-02-22 17:00:00'),
(47, NULL, 1, 15, '2020-02-22 17:00:00'),
(48, 1, 2, 20, '2020-02-22 17:00:00'),
(49, 3, 2, 20, '2020-02-22 17:00:00'),
(50, NULL, 2, 30, '2020-02-22 17:00:00'),
(51, NULL, 2, 30, '2020-02-22 17:00:00'),
(52, NULL, 1, 15, '2020-02-22 17:00:00'),
(53, NULL, 0, 15, '2020-02-22 17:00:00'),
(54, 3, 1, 10, '2020-02-22 17:00:00'),
(55, NULL, 2, 30, '2020-02-22 17:00:00'),
(56, NULL, 2, 30, '2020-02-22 17:00:00'),
(57, NULL, 3, 45, '2020-02-22 17:00:00'),
(58, 3, 1, 10, '2020-02-22 17:00:00'),
(59, 1, 2, 20, '2020-02-22 17:00:00'),
(60, 1, 2, 20, '2020-02-22 17:00:00'),
(61, 1, 2, 20, '2020-02-22 17:00:00'),
(62, 1, 2, 20, '2020-02-22 17:00:00'),
(63, 1, 2, 20, '2020-02-22 17:00:00'),
(64, NULL, 2, 30, '2020-02-23 17:00:00'),
(65, NULL, 2, 30, '2020-02-23 17:00:00'),
(66, NULL, 3, 45, '2020-02-23 17:00:00'),
(67, NULL, 1, 25, '2020-02-23 17:00:00'),
(68, NULL, 0, 10, '2020-02-23 17:00:00'),
(69, NULL, 0, 10, '2020-02-23 17:00:00'),
(70, NULL, 0, 10, '2020-02-23 17:00:00'),
(71, NULL, 0, 10, '2020-02-23 17:00:00'),
(72, NULL, 3, 45, '2020-02-23 17:00:00'),
(73, 3, 3, 30, '2020-02-23 17:00:00'),
(74, 1, 3, 30, '2020-02-23 17:00:00'),
(75, 1, 2, 20, '2020-02-23 17:00:00'),
(76, NULL, 2, 30, '2020-02-23 17:00:00'),
(77, NULL, 2, 30, '2020-02-23 17:00:00'),
(78, NULL, 3, 45, '2020-02-23 17:00:00'),
(79, NULL, 2, 30, '2020-02-23 17:00:00'),
(80, NULL, 3, 45, '2020-02-23 17:00:00'),
(81, 1, 4, 40, '2020-02-23 17:00:00'),
(82, 1, 2, 20, '2020-02-23 17:00:00'),
(83, NULL, 2, 30, '2020-02-23 17:00:00'),
(84, NULL, 5, 75, '2020-02-23 17:00:00'),
(85, NULL, 2, 30, '2020-02-23 17:00:00'),
(86, NULL, 2, 30, '2020-02-23 17:00:00'),
(87, NULL, 2, 30, '2020-02-23 17:00:00'),
(88, NULL, 3, 45, '2020-02-23 17:00:00'),
(89, NULL, 3, 45, '2020-02-23 17:00:00'),
(90, 3, 2, 20, '2020-02-23 17:00:00'),
(91, 1, 3, 30, '2020-02-23 17:00:00'),
(92, NULL, 2, 30, '2020-02-23 17:00:00'),
(93, NULL, 1, 15, '2020-02-23 17:00:00'),
(94, NULL, 1, 15, '2020-02-23 17:00:00'),
(95, NULL, 1, 15, '2020-02-23 17:00:00'),
(96, NULL, 2, 30, '2020-02-23 17:00:00'),
(97, NULL, 2, 30, '2020-02-23 17:00:00'),
(98, NULL, 2, 30, '2020-02-23 17:00:00'),
(99, 1, 2, 20, '2020-02-23 17:00:00'),
(100, 1, 2, 20, '2020-02-23 17:00:00'),
(101, 1, 2, 20, '2020-02-23 17:00:00'),
(102, NULL, 2, 30, '2020-02-23 17:00:00'),
(103, NULL, 2, 30, '2020-02-24 17:00:00'),
(104, 1, 3, 30, '2020-02-24 17:00:00'),
(105, 1, 4, 40, '2020-02-24 17:00:00'),
(106, NULL, 2, 30, '2020-02-24 17:00:00'),
(107, NULL, 2, 30, '2020-02-24 17:00:00'),
(108, NULL, 4, 60, '2020-02-24 17:00:00'),
(109, 1, 10, 100, '2020-02-24 17:00:00'),
(110, 1, 3, 30, '2020-02-24 17:00:00'),
(111, NULL, 3, 45, '2020-02-24 17:00:00'),
(112, 1, 2, 20, '2020-02-24 17:00:00'),
(113, NULL, 5, 75, '2020-02-24 17:00:00'),
(114, NULL, 4, 60, '2020-02-24 17:00:00'),
(115, NULL, 2, 30, '2020-02-24 17:00:00'),
(116, 1, 3, 30, '2020-02-24 17:00:00'),
(117, 3, 1, 10, '2020-02-24 17:00:00'),
(118, NULL, 4, 60, '2020-02-24 17:00:00'),
(119, NULL, 2, 30, '2020-02-24 17:00:00'),
(120, NULL, 3, 45, '2020-02-24 17:00:00'),
(121, NULL, 2, 30, '2020-02-24 17:00:00'),
(122, NULL, 4, 60, '2020-02-24 17:00:00'),
(123, NULL, 3, 45, '2020-02-24 17:00:00'),
(124, 3, 1, 10, '2020-02-24 17:00:00'),
(125, NULL, 3, 45, '2020-02-24 17:00:00'),
(126, 1, 3, 30, '2020-02-24 17:00:00'),
(127, 1, 1, 10, '2020-02-24 17:00:00'),
(128, 3, 3, 30, '2020-02-24 17:00:00'),
(129, NULL, 1, 15, '2020-02-24 17:00:00'),
(130, NULL, 2, 30, '2020-02-24 17:00:00'),
(131, NULL, 1, 15, '2020-02-24 17:00:00'),
(132, NULL, 3, 45, '2020-02-24 17:00:00'),
(133, NULL, 3, 45, '2020-02-24 17:00:00'),
(134, NULL, 7, 105, '2020-02-24 17:00:00'),
(135, NULL, 1, 15, '2020-02-24 17:00:00'),
(136, NULL, 1, 15, '2020-02-24 17:00:00'),
(137, 3, 2, 20, '2020-02-24 17:00:00'),
(138, 2, 3, 30, '2020-02-24 17:00:00'),
(139, 1, 1, 10, '2020-02-24 17:00:00'),
(140, NULL, 3, 45, '2020-02-24 17:00:00'),
(141, NULL, 2, 30, '2020-02-24 17:00:00'),
(142, NULL, 3, 45, '2020-02-24 17:00:00'),
(143, NULL, 4, 60, '2020-02-24 17:00:00'),
(144, NULL, 10, 150, '2020-02-24 17:00:00'),
(145, NULL, 2, 30, '2020-02-24 17:00:00'),
(146, NULL, 2, 30, '2020-02-24 17:00:00'),
(147, NULL, 2, 30, '2020-02-24 17:00:00'),
(148, NULL, 3, 45, '2020-02-24 17:00:00'),
(149, NULL, 2, 30, '2020-02-24 17:00:00'),
(150, 1, 3, 30, '2020-02-24 17:00:00'),
(151, NULL, 3, 45, '2020-02-24 17:00:00'),
(152, 1, 2, 20, '2020-02-24 17:00:00'),
(153, 1, 2, 20, '2020-02-24 17:00:00'),
(154, 1, 2, 20, '2020-02-24 17:00:00'),
(155, 3, 2, 20, '2020-02-24 17:00:00'),
(156, 1, 3, 30, '2020-02-24 17:00:00'),
(157, 3, 2, 20, '2020-02-24 17:00:00'),
(158, NULL, 2, 30, '2020-02-24 17:00:00'),
(159, 1, 3, 30, '2020-02-24 17:00:00'),
(160, NULL, 3, 45, '2020-02-24 17:00:00'),
(161, NULL, 2, 30, '2020-02-24 17:00:00'),
(162, NULL, 1, 15, '2020-02-24 17:00:00'),
(163, 3, 3, 30, '2020-02-24 17:00:00'),
(164, NULL, 2, 30, '2020-02-24 17:00:00'),
(165, 1, 2, 20, '2020-02-24 17:00:00'),
(166, NULL, 3, 45, '2020-02-24 17:00:00'),
(167, NULL, 3, 45, '2020-02-24 17:00:00'),
(168, 1, 1, 10, '2020-02-24 17:00:00'),
(169, NULL, 3, 45, '2020-02-24 17:00:00'),
(170, 3, 2, 20, '2020-02-24 17:00:00'),
(171, 6, 1, 10, '2020-02-24 17:00:00'),
(172, 6, 10, 100, '2020-02-24 17:00:00'),
(173, NULL, 2, 30, '2020-02-25 17:00:00'),
(174, NULL, 2, 30, '2020-02-25 17:00:00'),
(175, NULL, 3, 45, '2020-02-25 17:00:00'),
(176, 6, 3, 30, '2020-02-25 17:00:00'),
(177, 3, 1, 10, '2020-02-25 17:00:00'),
(178, 1, 2, 20, '2020-02-25 17:00:00'),
(179, 2, 2, 20, '2020-02-25 17:00:00'),
(180, 1, 2, 20, '2020-02-25 17:00:00'),
(181, NULL, 2, 30, '2020-02-25 17:00:00'),
(182, NULL, 2, 30, '2020-02-25 17:00:00'),
(183, 1, 2, 20, '2020-02-25 17:00:00'),
(184, 1, 2, 20, '2020-02-25 17:00:00'),
(185, NULL, 2, 30, '2020-02-25 17:00:00'),
(186, NULL, 2, 30, '2020-02-25 17:00:00'),
(187, NULL, 2, 30, '2020-02-25 17:00:00'),
(188, 1, 3, 30, '2020-02-25 17:00:00'),
(189, 1, 2, 20, '2020-02-25 17:00:00'),
(190, NULL, 2, 30, '2020-02-25 17:00:00'),
(191, 1, 2, 20, '2020-02-26 17:00:00'),
(192, 1, 3, 30, '2020-02-26 17:00:00'),
(193, NULL, 1, 15, '2020-02-26 17:00:00'),
(194, NULL, 2, 30, '2020-02-26 17:00:00'),
(195, NULL, 1, 15, '2020-02-26 17:00:00'),
(197, NULL, 2, 30, '2020-02-26 17:00:00'),
(198, NULL, 1, 15, '2020-02-26 17:00:00'),
(199, 1, 2, 20, '2020-02-26 17:00:00'),
(201, NULL, 1, 15, '2020-02-26 17:00:00'),
(202, 1, 2, 20, '2020-02-26 17:00:00'),
(204, 1, 2, 20, '2020-02-26 17:00:00'),
(206, 1, 2, 20, '2020-02-26 17:00:00'),
(207, 1, 1, 10, '2020-02-26 17:00:00'),
(208, 1, 2, 20, '2020-02-26 17:00:00'),
(210, 1, 2, 20, '2020-02-26 17:00:00'),
(212, 1, 2, 20, '2020-02-26 17:00:00'),
(215, 1, 2, 20, '2020-02-28 19:52:20'),
(216, 1, 3, 30, '2020-02-29 08:31:38'),
(217, 1, 2, 20, '2020-02-29 08:47:18'),
(218, NULL, 2, 30, '2020-02-29 08:58:07'),
(219, 10, 7, 70, '2020-02-29 09:02:20'),
(220, NULL, 2, 30, '2020-02-29 09:17:54'),
(221, 1, 2, 20, '2020-02-29 10:10:24'),
(222, 1, 3, 30, '2020-02-29 12:53:25'),
(223, NULL, 2, 30, '2020-02-29 13:01:27'),
(224, NULL, 3, 45, '2020-02-29 14:47:00'),
(225, 1, 2, 20, '2020-03-01 05:25:45'),
(226, NULL, 2, 30, '2020-03-02 04:36:02'),
(227, NULL, 1, 15, '2020-03-02 04:40:43'),
(228, 1, 2, 20, '2020-03-02 04:41:21'),
(229, 1, 1, 10, '2020-03-02 04:59:17'),
(230, NULL, 2, 30, '2020-03-02 06:55:15'),
(231, 1, 1, 10, '2020-03-02 08:36:06'),
(232, 1, 3, 30, '2020-03-02 16:46:04'),
(233, 1, 3, 30, '2020-03-02 17:04:36'),
(234, 1, 2, 20, '2020-03-09 12:16:12'),
(235, NULL, 2, 30, '2020-03-14 14:20:56'),
(236, 1, 2, 20, '2020-03-18 10:10:22'),
(237, 1, 3, 30, '2020-03-18 10:14:58'),
(238, 1, 3, 30, '2020-03-18 10:16:55'),
(239, NULL, 1, 15, '2020-03-18 10:18:28'),
(240, 1, 3, 30, '2020-03-18 10:19:53'),
(241, 1, 3, 30, '2020-03-18 10:26:12'),
(242, NULL, 2, 30, '2020-03-18 10:36:45'),
(243, NULL, 3, 45, '2020-03-18 10:38:02'),
(244, NULL, 3, 45, '2020-03-18 10:39:54'),
(245, NULL, 2, 30, '2020-03-18 10:43:34'),
(246, NULL, 2, 30, '2020-03-18 10:44:08'),
(247, NULL, 1, 15, '2020-03-18 10:45:29'),
(248, NULL, 1, 15, '2020-03-18 10:50:59'),
(249, 1, 2, 20, '2020-03-18 13:42:34'),
(250, 1, 2, 20, '2020-03-20 10:18:20'),
(251, 18, 1, 10, '2020-03-20 10:20:47'),
(252, 1, 3, 30, '2020-03-20 13:12:48'),
(254, NULL, 2, 30, '2020-03-20 14:02:43'),
(255, 18, 1, 15, '2020-03-20 14:14:46'),
(256, 18, 1, 10, '2020-03-20 14:14:46'),
(257, 18, 1, 10, '2020-03-20 14:35:30'),
(258, 1, 3, 30, '2020-03-21 08:05:39'),
(259, NULL, 2, 30, '2020-03-21 08:05:56'),
(260, NULL, 2, 30, '2020-03-21 08:06:30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `computers`
--
ALTER TABLE `computers`
  ADD PRIMARY KEY (`ComputerID`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `customersid`
--
ALTER TABLE `customersid`
  ADD PRIMARY KEY (`UserID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `UserID` (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admins`
--
ALTER TABLE `admins`
  MODIFY `AdminID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `computers`
--
ALTER TABLE `computers`
  MODIFY `ComputerID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT for table `customersid`
--
ALTER TABLE `customersid`
  MODIFY `UserID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `OrderID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=261;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customersid`
--
ALTER TABLE `customersid`
  ADD CONSTRAINT `CustomerID` FOREIGN KEY (`CustomerID`) REFERENCES `customers` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `UserID` FOREIGN KEY (`UserID`) REFERENCES `customersid` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
