USE [master]
GO
/****** Object:  Database [nhanvien_dongian]    Script Date: 4/14/2019 11:05:36 AM ******/
CREATE DATABASE [nhanvien_dongian]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'nhanvien_dongian', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\nhanvien_dongian.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'nhanvien_dongian_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\nhanvien_dongian_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [nhanvien_dongian] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [nhanvien_dongian].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [nhanvien_dongian] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET ARITHABORT OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [nhanvien_dongian] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [nhanvien_dongian] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [nhanvien_dongian] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET  DISABLE_BROKER 
GO
ALTER DATABASE [nhanvien_dongian] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [nhanvien_dongian] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [nhanvien_dongian] SET  MULTI_USER 
GO
ALTER DATABASE [nhanvien_dongian] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [nhanvien_dongian] SET DB_CHAINING OFF 
GO
ALTER DATABASE [nhanvien_dongian] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [nhanvien_dongian] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [nhanvien_dongian]
GO
/****** Object:  Table [dbo].[nhanvien]    Script Date: 4/14/2019 11:05:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhanvien](
	[manhanvien] [int] NOT NULL,
	[hoten] [nvarchar](50) NULL,
	[gioitinh] [nchar](20) NULL,
	[diachi] [nchar](50) NULL,
 CONSTRAINT [PK_nhanvien] PRIMARY KEY CLUSTERED 
(
	[manhanvien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
USE [master]
GO
ALTER DATABASE [nhanvien_dongian] SET  READ_WRITE 
GO
