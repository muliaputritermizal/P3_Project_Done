-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2015 at 11:55 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `komik`
--

-- --------------------------------------------------------

--
-- Table structure for table `komik`
--

CREATE TABLE IF NOT EXISTS `komik` (
  `id_komik` int(11) NOT NULL,
  `judul` varchar(60) DEFAULT NULL,
  `id_penulis` int(11) DEFAULT NULL,
  `penerbit` varchar(60) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `komik`
--

INSERT INTO `komik` (`id_komik`, `judul`, `id_penulis`, `penerbit`) VALUES
(5, 'fairy tail ', 4, 'gramedia'),
(10, 'onepiece', 4, 'Gramedia');

-- --------------------------------------------------------

--
-- Table structure for table `penulis`
--

CREATE TABLE IF NOT EXISTS `penulis` (
  `id_penulis` int(11) NOT NULL,
  `nama_penulis` varchar(60) DEFAULT NULL,
  `alamat` varchar(60) DEFAULT NULL,
  `no_hp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penulis`
--

INSERT INTO `penulis` (`id_penulis`, `nama_penulis`, `alamat`, `no_hp`) VALUES
(4, 'mulia putri termizal', 'jakarta dki', '97797'),
(5, 'imam firmansyah', 'depok2', '345433e435'),
(8, 'benny whelan', 'jakarta dki', '4566'),
(11, 'muhammad nizar', 'jakarta dki', '73645345'),
(12, 'Maharani tosca', 'Payakumbuh', '3536'),
(13, 'laura', 'Jakarta', '5456456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komik`
--
ALTER TABLE `komik`
  ADD PRIMARY KEY (`id_komik`),
  ADD KEY `id_penulis` (`id_penulis`);

--
-- Indexes for table `penulis`
--
ALTER TABLE `penulis`
  ADD PRIMARY KEY (`id_penulis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `komik`
--
ALTER TABLE `komik`
  MODIFY `id_komik` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `penulis`
--
ALTER TABLE `penulis`
  MODIFY `id_penulis` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `komik`
--
ALTER TABLE `komik`
  ADD CONSTRAINT `fk_komik_penulis` FOREIGN KEY (`id_penulis`) REFERENCES `penulis` (`id_penulis`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
