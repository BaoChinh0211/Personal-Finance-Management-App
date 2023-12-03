CREATE DATABASE [PersonalExpenseManagement]
USE [PersonalExpenseManagement]
CREATE TABLE [User]
(
	UserId INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[Name] NVARCHAR(30) NOT NULL,
	UserName VARCHAR(20) NOT NULL UNIQUE,
	[Password] VARCHAR(64) NOT NULL,
	Email VARCHAR(256) NULL,
);

CREATE TABLE [Group]
(
	GroupId INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[Name] NVARCHAR(30) NOT NULL,
	[Type] BIT NOT NULL,
	UserId INT NOT NULL, 
	CONSTRAINT FK_GroupUser FOREIGN KEY (UserId) REFERENCES [User](UserId) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Revenues
(
	RevenuesId INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	Amount INT NOT NULL,
	[DateTime] SMALLDATETIME NOT NULL,
	Note NVARCHAR(200) NULL,
	GroupId INT NOT NULL,
	CONSTRAINT FK_RevenuesGroup FOREIGN KEY (GroupId) REFERENCES [Group](GroupId) ON DELETE CASCADE ON UPDATE CASCADE
);