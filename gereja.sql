-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Agu 2022 pada 22.03
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gereja`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(30) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
('AN01', 'sekretariat', 'gereja'),
('AN02', 'pastor', 'gereja');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_anggota`
--

CREATE TABLE `data_anggota` (
  `ID_anggota` varchar(30) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jkel` varchar(30) NOT NULL,
  `status` varchar(50) NOT NULL,
  `pekerjaan` varchar(100) NOT NULL,
  `lingkungan` varchar(100) NOT NULL,
  `stasi` varchar(100) NOT NULL,
  `jabatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_anggota`
--

INSERT INTO `data_anggota` (`ID_anggota`, `nama`, `jkel`, `status`, `pekerjaan`, `lingkungan`, `stasi`, `jabatan`) VALUES
('A0001', 'Oscar', 'Laki - laki ', 'Sudah Menikah', 'Tenaga IT', 'St. Bernadetha', 'Gereja Paroki Pakumbang', 'Ketua Umum'),
('A0002', 'Suryahadi Surya', 'Laki - laki ', 'Sudah Menikah', 'Petani Sawah', 'St. Maria', 'Gereja Stasi Tebing Tinggi', 'Wakil Ketua Umum'),
('A0003', 'Aliza', 'Perempuan', 'Belum Menikah', 'Pengacara', 'St. Klara', 'Gereja Stasi Tapakng', 'Badan Hukum'),
('A0004', 'Georges Mulyadi', 'Laki - laki ', 'Sudah Menikah', 'Guru SMA', 'St. Nikodemus', 'Gereja Stasi Pojok', 'Sekretaris'),
('A0005', 'Emeliana Cindy', 'Perempuan', 'Sudah Menikah', 'Ibu Rumah Tangga', 'St. Lazarus', 'Gereja Stasi Tengge', 'Bendahara'),
('A0006', 'Bertie Verto', 'Laki - laki ', 'Belum Menikah', 'Perawat', 'St. Maria', 'Gereja Stasi Seba', 'Katekis'),
('A0007', 'Tomotius Johang', 'Laki - laki ', 'Belum Menikah', 'Dosen Filsafat', 'St. Bernadetha', 'Gereja Stasi Lutukng', 'Asisten Imam (PRODIAKON)'),
('A0008', 'Oktavia Via', 'Perempuan', 'Sudah Menikah', 'Pengusa Kue', 'St. Yakobus ', 'Gereja Stasi Berinang', 'Kelompok Kategorial'),
('A0009', 'Novi Lianti', 'Perempuan', 'Sudah Menikah', 'Pengusaha Sarang walet', 'St. Bernadetha', 'Gereja Paroki Pakumbang', 'Ketua Bidang Persekutuan (COINONIA)'),
('A0010', 'Lorensius Fransus Bara', 'Laki - laki ', 'Belum Menikah', 'Dosen Olahraga', 'St. Teresia', 'Gereja Stasi Betung', 'Ketua Bidang Katekese (KERYGMA)'),
('A0011', 'Ediator Rere', 'Laki - laki ', 'Sudah Menikah', 'Staff Balai Desa', 'St. Yakobus ', 'Gereja Stasi Pinyaho', 'Ketua Bidang Pelayanan Sosial (DIAKONIA)'),
('A0012', 'Riyan fernandes', 'Laki - laki ', 'Sudah Menikah', 'Guru SMP', 'St. Lazarus', 'Gereja Stasi Mangaro', 'Ketua Bidang Peribadatan (LITURGI)');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_baptis`
--

CREATE TABLE `data_baptis` (
  `ID_baptis` varchar(20) NOT NULL,
  `namacb` varchar(100) NOT NULL,
  `tmplahir` varchar(50) NOT NULL,
  `tgllahir` varchar(30) NOT NULL,
  `dbaptis` varchar(100) NOT NULL,
  `tmpbaptis` varchar(50) NOT NULL,
  `tglbaptis` varchar(30) NOT NULL,
  `ayah` varchar(100) NOT NULL,
  `ibu` varchar(100) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `tlpn` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_baptis`
--

INSERT INTO `data_baptis` (`ID_baptis`, `namacb`, `tmplahir`, `tgllahir`, `dbaptis`, `tmpbaptis`, `tglbaptis`, `ayah`, `ibu`, `alamat`, `tlpn`) VALUES
('CB0001', 'Surya Andreas', 'Jakarta barat', 'Rabu 20 Januari 2010', 'P. Blass, MSA', 'Gereja Stasi Tebing Tinggi', 'Minggu 21 Agustus 2022', 'Teguh', 'Riana', 'Jln Raya Condet Jakarta Timur', '085783476879'),
('CB0002', 'Silvanus Oscar', 'Kuala Dua', 'Senin 08 Februari 2010', 'P. Romanus, MSA', 'Gereja Paroki Pakumbang', 'Minggu 21 Agustus 2022', 'RR', 'HE', 'Jln Raya Pakumbang No. 34 RT/RW 09/07', '089895679023'),
('CB0003', 'Fikri Sumantri', 'Depok Timur', 'Kamis 30 Juli 2015', 'P. Ruben Ruruk Sandalajuk, MSA', 'Gereja Paroki Pakumbang', 'Minggu 21 Agustus 2022', 'Suri', 'Santi', 'Jln Surilang depok no 34 ', '087653898745'),
('CB0004', 'Christye', 'Galar', 'Rabu 20 Januari 2010', 'P. Frans, MSA', 'Gereja Stasi Galar', 'Minggu 21 Agustus 2022', 'Roy', 'Elita', 'Jln Raya Galar RT/RW 08/07 ', '087654678990'),
('CB0005', 'Fanya Shana', 'Omoh', 'Kamis 30 Juli 2015', 'P. Ebit, MSA', 'Gereja Stasi Tapakng', 'Minggu 21 Agustus 2022', 'Artus Miles', 'Florance', 'Jln. Raya Tapakng No.46 RT/RW 08/89', '087654367890'),
('CB0006', 'Robby', 'Lingkonong', 'Rabu 17 Agustus 2016', 'P. Ruben Ruruk Sandalajuk, MSA', 'Gereja Stasi Berinang', 'Minggu 21 Agustus 2022', 'Erick', 'Luciana', 'Jln Raya Lingkonong No.78 RT/RW 008/07', '086754673421'),
('CB0007', 'Olva', 'Sompak', 'Jumat 29 Maret 2013', 'P. Romanus, MSA', 'Gereja Stasi Sompak', 'Minggu 21 Agustus 2022', 'Teodoro', 'Yolanthe', 'Jln. Raya Sompak No.90 RT/RW 06/04', '087865456092'),
('CB0008', 'Tomas', 'Samugih', 'Selasa 13 Oktober 2009', 'P. Blass, MSA', 'Gereja Stasi Semugih', 'Minggu 21 Agustus 2022', 'Leonardus', 'Veronika', 'Jln Raya Samugih No78 RT/RW 09', '087567453498'),
('CB0009', 'Nobie Zed', 'Mangaro', 'Senin 05 Oktober 2009', 'P. Ebit, MSA', 'Gereja Stasi Mangaro', 'Minggu 21 Agustus 2022', 'Wilhelm', 'Laurel', 'Jln Raya Mangaro No.56 RT/RW 09/78', '087865432356'),
('CB0010', 'Cynthie', 'Sungai Pinang', 'Senin 22 Agustus 2022', 'P. Frans, MSA', 'Gereja Stasi Sungai Pinang', 'Minggu 21 Agustus 2022', 'Shanks', 'Makino', 'Jln Sraya Sungai Pinang No.89 RT/RW 09/65', '086753245789');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_jemaatgereja`
--

CREATE TABLE `data_jemaatgereja` (
  `ID_jemaat` varchar(30) NOT NULL,
  `nma_Baptis` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tmp_lahir` varchar(100) NOT NULL,
  `tgllahir` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(30) NOT NULL,
  `status` varchar(50) NOT NULL,
  `tmp_baptis` varchar(100) NOT NULL,
  `tglbaptis` varchar(50) NOT NULL,
  `pendidikan` varchar(100) NOT NULL,
  `pekerjaan` varchar(100) NOT NULL,
  `lingkungan2` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_jemaatgereja`
--

INSERT INTO `data_jemaatgereja` (`ID_jemaat`, `nma_Baptis`, `nama`, `tmp_lahir`, `tgllahir`, `jenis_kelamin`, `status`, `tmp_baptis`, `tglbaptis`, `pendidikan`, `pekerjaan`, `lingkungan2`, `alamat`) VALUES
('KK0001', 'Dani', 'Yakobus Dani', 'Jakarta Selatan', '2000-01-01', 'Laki - laki', 'Ayah', 'Jakarta Timur', '2005-05-22', 'Perguruan Tinggi', 'Pegawai Swasta', 'St. Maria', 'Jln Raya Rawamangun No.34 RT/RW 008/098 Jakarta'),
('KK0001', 'Astrid', 'Maria Astrid', 'Jakarta Barat', '2001-11-18', 'Perempuan', 'Ibu', 'Jakarta Timur', '2005-03-27', 'SMA/SMK', 'Ibu Rumah Tangga', 'St. Maria', 'Jln Raya Rawamangun No.34 RT/RW 008/098 Jakarta'),
('KK0001', 'Justino', 'Fransiskus Justino', 'Rawamangun', '2019-06-20', 'Laki - laki', 'Anak Pertama', 'Jakarta pusat', '2019-10-13', ' Belum Sekolah', 'Belum Bekerja', 'St. Maria', 'Jln Raya Rawamangun No.34 RT/RW 008/098 Jakarta'),
('KK0001', 'Vanya', 'Magdalena Vanya', 'Jakarta pusat', '2020-03-12', 'Perempuan', 'Anak Kedua', 'Jakarta Pusat ', '2020-12-27', 'Belum Sekolah', 'Belum Bekerja', 'St. Maria', 'Jln Raya Rawamangun No.34 RT/RW 008/098 Jakarta'),
('KK0002', 'Silvanus Tri Oscar', 'Oscar', 'Kuala Dua', '2001-02-08', 'Laki - laki', 'Ayah', 'Pontianak', '2022-03-20', 'Perguruan Tinggi', 'Tenaga IT', 'St. Bernadetha', 'Jln. Raya Sudirman Jakarta No.01 RT/RW 009/004 DKI Jakarta'),
('KK0002', 'Fransiska Novi Lianti', 'Novi Lianti', 'Sambas', '2002-11-15', 'Perempuan', 'Ibu', 'Pakumbang', '2020-12-06', 'SMA/SMK', 'Ibu Rumah Tangga', 'St. Bernadetha', 'Jln. Raya Sudirman Jakarta No.01 RT/RW 009/004 DKI Jakarta'),
('KK0002', 'Magdalena Sylas ', 'Putri Sylas Shani', 'Pontianak', '2021-02-04', 'Perempuan', 'Anak Pertama', 'Pakumbang', '2021-03-21', 'Belum Sekolah', 'Belum Bekerja', 'St. Bernadetha', 'Jln. Raya Sudirman Jakarta No.01 RT/RW 009/004 DKI Jakarta'),
('KK0002', 'Joana Yohanes', 'Putra Joana Stevena', 'Sambas', '2021-11-08', 'Laki - laki', 'Anak Kedua', 'Sekura', '2022-01-02', 'Belum Sekolah', 'Belum Bekerja', 'St. Bernadetha', 'Jln. Raya Sudirman Jakarta No.01 RT/RW 009/004 DKI Jakarta');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_kolekte`
--

CREATE TABLE `data_kolekte` (
  `ID_kolekte` varchar(30) NOT NULL,
  `nma_gereja` varchar(100) NOT NULL,
  `tglminggu` varchar(30) NOT NULL,
  `kolekteke` varchar(100) NOT NULL,
  `mingguke` varchar(20) NOT NULL,
  `nominal` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_kolekte`
--

INSERT INTO `data_kolekte` (`ID_kolekte`, `nma_gereja`, `tglminggu`, `kolekteke`, `mingguke`, `nominal`) VALUES
('KM0001', 'Gereja Paroki Pakumbang', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 100000000),
('KM0002', 'Gereja Paroki Pakumbang', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 3000000),
('KM0003', 'Gereja Stasi Pinyaho', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 5000000),
('KM0004', 'Gereja Stasi Pinyaho', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 1500000),
('KM0005', 'Gereja Stasi Jame ', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 5500000),
('KM0006', 'Gereja Stasi Jame ', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 1350000),
('KM0007', 'Gereja Stasi Betung', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 4670000),
('KM0008', 'Gereja Stasi Betung', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 3400000),
('KM0009', 'Gereja Stasi Tebing Tinggi', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 6000000),
('KM0010', 'Gereja Stasi Tebing Tinggi', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 4500000),
('KM0011', 'Gereja Stasi Mangaro', 'Minggu 07 Agustus 2022', 'Kolekte 1', 'Minggu 1', 6500000),
('KM0012', 'Gereja Stasi Mangaro', 'Minggu 07 Agustus 2022', 'Kolekte 2', 'Minggu 1', 2300000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pemasukan`
--

CREATE TABLE `data_pemasukan` (
  `ID_pemasukan` varchar(30) NOT NULL,
  `id_admin` varchar(30) NOT NULL,
  `tglpemasukan` varchar(50) NOT NULL,
  `nma_pemasukan` varchar(100) NOT NULL,
  `jml_pemasukan` varchar(100) NOT NULL,
  `jns_pemasukan` varchar(100) NOT NULL,
  `ket_pemasukan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_pemasukan`
--

INSERT INTO `data_pemasukan` (`ID_pemasukan`, `id_admin`, `tglpemasukan`, `nma_pemasukan`, `jml_pemasukan`, `jns_pemasukan`, `ket_pemasukan`) VALUES
('PP0001', 'AN01', 'Senin 01 Agustus 2022', 'Kolekte 1', '80000', 'Uang', 'Uang Kolekte hari minggu 26/06/2022'),
('PP0002', 'AN01', 'Jumat 05 Agustus 2022', 'Kolekte 2', '20000', 'Uang', 'Hari minggu kolekte 2'),
('PP0003', 'AN01', 'Sabtu 06 Agustus 2022', 'Beras', '100', 'Barang', 'Beras dari bapak Surya'),
('PP0004', 'AN01', 'Kamis 18 Agustus 2022', 'Sabun', '100', 'Barang', 'Sumbangan sabun  mandi 100 batang dari bapak sumantri'),
('PP0005', 'AN02', 'Selasa 23 Agustus 2022', 'Kolekte 2', '3000000', 'Uang', 'Uang Kolekte 2 minggu 07/08/2022'),
('PP0006', 'AN02', 'Minggu 21 Agustus 2022', 'Indomie ', '30', 'Barang', 'Sumbangan dari bapak Andri'),
('PP0007', 'AN01', 'Minggu 21 Agustus 2022', 'Kolekte 2', '1500000', 'Uang', 'Uang Kolekte minggu 07/08/2022'),
('PP0008', 'AN02', 'Sabtu 20 Agustus 2022', 'Beras ', '150', 'Barang', 'Sumbangan dari desa 150kg beras');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pengeluaran`
--

CREATE TABLE `data_pengeluaran` (
  `ID_pengeluaran` varchar(30) NOT NULL,
  `tanggal_pengeluaran` varchar(50) NOT NULL,
  `ID_admin` varchar(30) NOT NULL,
  `ID_anggota` varchar(50) NOT NULL,
  `nma_anggota` varchar(100) NOT NULL,
  `ID_pemasukan` varchar(30) NOT NULL,
  `nma_pemasukan` varchar(50) NOT NULL,
  `jenis_pemasukan` varchar(50) NOT NULL,
  `bnyk_pengeluaran` varchar(50) NOT NULL,
  `ket` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_pengeluaran`
--

INSERT INTO `data_pengeluaran` (`ID_pengeluaran`, `tanggal_pengeluaran`, `ID_admin`, `ID_anggota`, `nma_anggota`, `ID_pemasukan`, `nma_pemasukan`, `jenis_pemasukan`, `bnyk_pengeluaran`, `ket`) VALUES
('PG0004', '2022-06-25', 'AN0002', '', 'Boby', 'PP0004', 'Kolekte 1', 'Uang', '10000', '-'),
('PG0004', '2022-06-25', 'AN0002', '', 'Boby', 'PP0003', 'Beras', 'Barang', '3', '-'),
('PG0005', '2022-06-25', 'AN0001', '', 'gaur', 'PP0005', 'Sabun', 'Barang', '10', 'kebutuhan anak pastoran'),
('PG0005', '2022-06-25', 'AN0001', '', 'Gaur', 'PP0003', 'Beras', 'Barang', '2', 'kebutuhan anak pastoran'),
('PG0006', '2022-06-29', 'AN0002', '', 'Oscar', 'PP0005', 'Sabun', 'Barang', '5', 'Untuk Mandi'),
('PG0007', '2022-07-21', 'AN01', '', 'Oscar', 'PP0005', 'Sabun', 'Barang', '5', '-'),
('PG0007', '2022-07-21', 'AN01', '', 'Oscar', 'PP0003', 'Beras', 'Barang', '2', '-'),
('PG0008', '2022-07-22', 'AN01', 'A0001', 'Oscar', 'PP0005', 'Sabun', 'Barang', '5', '-'),
('PG0009', '2022-07-22', 'AN01', 'A0002', 'Anjay', 'PP0005', 'Sabun', 'Barang', '5', '-'),
('PG0009', '2022-07-22', 'AN01', 'A0002', 'Anjay', 'PP0002', 'Kolekte 1', 'Uang', '10000', '-'),
('PG0010', '2022-07-29', 'AN01', 'A0002', 'Anjay', '9090', 'beras', 'barang', '2', '-'),
('PG0011', '2022-08-03', 'AN01', 'A0001', 'Oscar', 'PP0001', 'Kolekte 1', 'Uang', '50000', '-');

--
-- Trigger `data_pengeluaran`
--
DELIMITER $$
CREATE TRIGGER `pengeluaran` AFTER INSERT ON `data_pengeluaran` FOR EACH ROW BEGIN
UPDATE data_pemasukan SET jml_pemasukan = jml_pemasukan-NEW.bnyk_pengeluaran
WHERE ID_pemasukan = NEW.ID_pemasukan;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `nama_username` varchar(50) NOT NULL,
  `waktu` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`nama_username`, `waktu`) VALUES
('sekretariat', '2022-08-23 (00:00:35)'),
('pastor', '2022-08-23 (00:51:33)'),
('sekretariat', '2022-08-23 (02:55:33)'),
('pastor', '2022-08-23 (02:55:52)');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembuatan_jadwal`
--

CREATE TABLE `pembuatan_jadwal` (
  `ID_jadwal` varchar(20) NOT NULL,
  `tglpelayanan` varchar(30) NOT NULL,
  `jam` varchar(20) NOT NULL,
  `nma_imam` varchar(100) NOT NULL,
  `tmp_pelayanan` varchar(100) NOT NULL,
  `ket` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembuatan_jadwal`
--

INSERT INTO `pembuatan_jadwal` (`ID_jadwal`, `tglpelayanan`, `jam`, `nma_imam`, `tmp_pelayanan`, `ket`) VALUES
('0001', 'Rabu 06 Juli 2022', '08.00 - 09.00', 'P. Blass, MSA', 'Gereja Stasi Pinyaho', 'Doa bersama'),
('0002', 'Rabu 06 Juli 2022', '09.00 - selesai', 'P. Romanus, MSA', 'Gereja Stasi Pinyaho', 'Misa di gereja'),
('0003', 'Sabtu 06 Agustus 2022', '15.00 - 17.00', 'P. Blass, MSA', 'Gereja Stasi Mangaro', 'Doa Syukuran'),
('0004', 'Jumat 30 September 2022', '11.00 - 14.00', 'P. Ruben Ruruk Sandalajuk, MSA', 'Gereja Stasi Semugih', 'Doa Syukuran'),
('0005', 'Minggu 04 September 2022', '07.30 - 09.00', 'P. Frans, MSA', 'Gereja Paroki Pakumbang', 'Misa Hari Minggu'),
('0006', 'Minggu 11 September 2022', '07.30 - 09.00', 'P. Ebit, MSA', 'Gereja Stasi Lutukng', 'Misa Hari Minggu'),
('0007', 'Minggu 18 September 2022', '09.00 - 12.00', 'Diakon', 'Gereja Stasi Kencok', 'Misa Hari Minggu'),
('0008', 'Minggu 25 September 2022', '07.30 - 09.00', 'P. Ruben Ruruk Sandalajuk, MSA', 'Gereja Stasi Dago', 'Misa Hari Minggu'),
('0009', 'Rabu 28 September 2022', '19.00 - 21.00', 'P. Romanus, MSA', 'Gereja Stasi Emang', 'Doa 100 hari meninggal orang emang'),
('0010', 'Rabu 14 September 2022', '15.00 - 17.00', 'Diakon', 'Gereja Stasi Sadok', 'Doa Sykuran sunatan'),
('0011', 'Senin 05 Desember 2022', '09.00 - 13.00', 'P. Ebit, MSA', 'Gereja Stasi Sompak', 'Pemberkatan Pernikahan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_anggota`
--
ALTER TABLE `data_anggota`
  ADD PRIMARY KEY (`ID_anggota`);

--
-- Indeks untuk tabel `data_baptis`
--
ALTER TABLE `data_baptis`
  ADD PRIMARY KEY (`ID_baptis`);

--
-- Indeks untuk tabel `data_kolekte`
--
ALTER TABLE `data_kolekte`
  ADD PRIMARY KEY (`ID_kolekte`);

--
-- Indeks untuk tabel `data_pemasukan`
--
ALTER TABLE `data_pemasukan`
  ADD PRIMARY KEY (`ID_pemasukan`);

--
-- Indeks untuk tabel `pembuatan_jadwal`
--
ALTER TABLE `pembuatan_jadwal`
  ADD PRIMARY KEY (`ID_jadwal`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
