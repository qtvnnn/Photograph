USE [p0017]
GO
/****** Object:  Table [dbo].[Gallery]    Script Date: 3/1/2021 1:13:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gallery](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NULL,
	[description] [nvarchar](max) NULL,
	[image] [nvarchar](50) NULL,
 CONSTRAINT [PK_Gallery] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ImageGallery]    Script Date: 3/1/2021 1:13:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ImageGallery](
	[image] [nvarchar](50) NOT NULL,
	[gallery_id] [int] NOT NULL,
	[id] [int] NULL,
 CONSTRAINT [PK_ImageGallery] PRIMARY KEY CLUSTERED 
(
	[image] ASC,
	[gallery_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Information]    Script Date: 3/1/2021 1:13:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Information](
	[address] [nvarchar](max) NULL,
	[city] [nvarchar](max) NULL,
	[country] [nvarchar](50) NULL,
	[tel] [nvarchar](50) NULL,
	[email] [nvarchar](max) NULL,
	[image] [nvarchar](50) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Intro]    Script Date: 3/1/2021 1:13:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Intro](
	[image] [nvarchar](50) NULL,
	[descript] [nvarchar](max) NULL,
	[aboutme] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Share]    Script Date: 3/1/2021 1:13:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Share](
	[icon] [nvarchar](50) NULL,
	[social_network] [nvarchar](50) NOT NULL,
	[url] [nvarchar](max) NULL,
 CONSTRAINT [PK_Share] PRIMARY KEY CLUSTERED 
(
	[social_network] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (1, N'Gallery 1', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh1.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (2, N'Gallery 2', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh2.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (3, N'Gallery 3', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh3.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (4, N'Gallery 4', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'anh1.jpg')
INSERT [dbo].[Gallery] ([id], [name], [description], [image]) VALUES (5, N'Gallery5', N'abcde', N'anh1.jpg')
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh0.jpg', 1, 16)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh0.jpg', 2, 17)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh0.jpg', 3, 18)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh0.jpg', 5, 16)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh1.jpg', 1, 4)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh1.jpg', 2, 5)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh1.jpg', 3, 6)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh1.jpg', 4, 25)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh2.jpg', 1, 7)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh2.jpg', 2, 8)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh2.jpg', 3, 9)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh2.jpg', 4, 27)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh3.jpg', 1, 27)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh4.jpg', 1, 13)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh4.jpg', 2, 14)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh4.jpg', 3, 15)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh5.jpg', 1, 10)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh5.jpg', 2, 11)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh5.jpg', 3, 12)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh5.jpg', 4, 28)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh6.jpg', 1, 19)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh6.jpg', 2, 20)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh6.jpg', 3, 21)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh7.jpg', 1, 22)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh7.jpg', 2, 23)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh7.jpg', 3, 24)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh9.jpg', 1, 1)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh9.jpg', 2, 2)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh9.jpg', 3, 3)
INSERT [dbo].[ImageGallery] ([image], [gallery_id], [id]) VALUES (N'anh9.jpg', 4, 26)
INSERT [dbo].[Information] ([address], [city], [country], [tel], [email], [image]) VALUES (N'Cat Hai', N'Hai Phong', N'Viet Nam', N'0888202515', N'namdthe130269@fpt.edu.vn', N'vt.png')
INSERT [dbo].[Intro] ([image], [descript], [aboutme]) VALUES (N'anh0.jpg', N'Lorem ipsum dolor sit amet', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim')
INSERT [dbo].[Share] ([icon], [social_network], [url]) VALUES (N'fb.png', N'Facebook', N'https://www.facebook.com/')
INSERT [dbo].[Share] ([icon], [social_network], [url]) VALUES (N'gg.png', N'Google+', N'https://www.google.com.vn/')
INSERT [dbo].[Share] ([icon], [social_network], [url]) VALUES (N'tw.png', N'Twitter', N'https://twitter.com/')
ALTER TABLE [dbo].[ImageGallery]  WITH CHECK ADD  CONSTRAINT [FK_ImageGallery_Gallery] FOREIGN KEY([gallery_id])
REFERENCES [dbo].[Gallery] ([id])
GO
ALTER TABLE [dbo].[ImageGallery] CHECK CONSTRAINT [FK_ImageGallery_Gallery]
GO
