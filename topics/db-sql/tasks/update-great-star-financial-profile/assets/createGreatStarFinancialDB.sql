USE [GreatStarFinancial]
GO
/****** Object:  User [gsfuser]    Script Date: 09.05.2013 0:15:29 ******/
CREATE USER [gsfuser] FOR LOGIN [gsfuser] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [gsfuser]
GO
/****** Object:  StoredProcedure [dbo].[ResetMembers]    Script Date: 09.05.2013 0:15:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Description:	This stored procedure resets Members table in database
-- =============================================
CREATE PROCEDURE [dbo].[ResetMembers]
AS
BEGIN
	SET NOCOUNT ON;
	UPDATE Members SET Disclaimer = null
	Delete from Members where [Member Id] > 4
END

GO
/****** Object:  Table [dbo].[Companies]    Script Date: 09.05.2013 0:15:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Companies](
	[Company Id] [int] IDENTITY(1,1) NOT NULL,
	[Company Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Companies] PRIMARY KEY CLUSTERED 
(
	[Company Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Members]    Script Date: 09.05.2013 0:15:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Members](
	[Member Id] [int] IDENTITY(1,1) NOT NULL,
	[Email address] [nvarchar](50) NOT NULL,
	[First Name] [nvarchar](50) NOT NULL,
	[Middle Name] [nvarchar](50) NULL,
	[Last Name] [nvarchar](50) NOT NULL,
	[Appears as] [nvarchar](50) NOT NULL,
	[Disclaimer] [ntext] NULL,
	[Company Id] [int] NULL,
 CONSTRAINT [PK_Members] PRIMARY KEY CLUSTERED 
(
	[Member Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[UserImportData]    Script Date: 09.05.2013 0:15:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UserImportData](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Email address] [nvarchar](50) NOT NULL,
	[First Name] [nvarchar](50) NOT NULL,
	[Middle Name] [nvarchar](50) NULL,
	[Last Name] [nvarchar](50) NOT NULL,
	[DBAName] [nvarchar](50) NULL,
	[RegisteredRep] [bit] NOT NULL,
	[EagleStrategies] [bit] NOT NULL,
	[DBA] [bit] NOT NULL,
	[CompanyName] [nvarchar](50) NULL,
 CONSTRAINT [PK_UserImportData] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Companies] ON 

INSERT [dbo].[Companies] ([Company Id], [Company Name]) VALUES (1, N'Great Star LLC')
INSERT [dbo].[Companies] ([Company Id], [Company Name]) VALUES (2, N'Great Star Inc.')
INSERT [dbo].[Companies] ([Company Id], [Company Name]) VALUES (3, N'Great Star Securities LLC')
SET IDENTITY_INSERT [dbo].[Companies] OFF
SET IDENTITY_INSERT [dbo].[Members] ON 

INSERT [dbo].[Members] ([Member Id], [Email address], [First Name], [Middle Name], [Last Name], [Appears as], [Disclaimer], [Company Id]) VALUES (1, N'danstewart@gmail.com', N'Dan', N' ', N'Stewart', N'Dan Stewart', NULL, 1)
INSERT [dbo].[Members] ([Member Id], [Email address], [First Name], [Middle Name], [Last Name], [Appears as], [Disclaimer], [Company Id]) VALUES (2, N'johndoe@yahoo.com', N'John', NULL, N'Doe', N'John Doe', NULL, 2)
INSERT [dbo].[Members] ([Member Id], [Email address], [First Name], [Middle Name], [Last Name], [Appears as], [Disclaimer], [Company Id]) VALUES (3, N'mikegraham@gmail.com', N'Mike', N'J.', N'Graham', N'Mike J. Graham', NULL, 3)
INSERT [dbo].[Members] ([Member Id], [Email address], [First Name], [Middle Name], [Last Name], [Appears as], [Disclaimer], [Company Id]) VALUES (4, N'brianwatson', N'Brian', NULL, N'Watson', N'Brian Watson, Agent', NULL, NULL)
SET IDENTITY_INSERT [dbo].[Members] OFF
SET IDENTITY_INSERT [dbo].[UserImportData] ON 

INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (1, N'danstewart@gmail.com', N'Dan', N'', N'Stewart', N'', 1, 0, 0, N'Great Star LLC')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (3, N'johndoe@yahoo.com', N'John', NULL, N'Doe', NULL, 0, 1, 0, N'Great Star Inc.')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (4, N'mikegraham@gmail.com', N'Mike', N'J.', N'Graham', N'Star Partnership', 0, 0, 1, N'Great Star Securities LLC')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (5, N'philjohnson@gmail.com', N'Philip', N'James', N'Johnson', N'Brown Family Enterprise', 0, 0, 1, N'Great Star Securities LLC')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (6, N'andrewbrown@yahoo.com', N'Andrew', NULL, N'Brown', NULL, 1, 0, 0, N'Great Star LLC')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (7, N'arnoldsinsky@yahoo.com', N'Arnold', NULL, N'Sinsky', NULL, 1, 0, 0, N'Great Star Productions')
INSERT [dbo].[UserImportData] ([ID], [Email address], [First Name], [Middle Name], [Last Name], [DBAName], [RegisteredRep], [EagleStrategies], [DBA], [CompanyName]) VALUES (8, N'maxadamson@hotmail.com', N'Max', NULL, N'Adamson', NULL, 0, 1, 0, N'Great Star Company')
SET IDENTITY_INSERT [dbo].[UserImportData] OFF
ALTER TABLE [dbo].[Members]  WITH NOCHECK ADD  CONSTRAINT [FK_Members_Companies] FOREIGN KEY([Company Id])
REFERENCES [dbo].[Companies] ([Company Id])
GO
ALTER TABLE [dbo].[Members] NOCHECK CONSTRAINT [FK_Members_Companies]
GO
