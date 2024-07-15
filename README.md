Game Sales System
This project is developed to manage game sales operations. It includes managing players, campaigns, products, and sales transactions.

Table of Contents
Installation
Usage
Project Structure
Contributors
License
Installation
To set up the project locally, follow these steps:

Clone the repository:

git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
cd YOUR-REPOSITORY


nstall the necessary dependencies (e.g., if using Maven):

mvn install

Configure the database connection settings in the src/main/resources/application.properties file.

Create the necessary tables and insert sample data.

Usage
To run the project:

Start the application:

mvn spring-boot:run

Open the following URL in your web browser:

http://localhost:8080

Project Structure
This project includes the following main classes and packages:

Abstract
BasePlayerManager.java
ICampaignService.java
IEntity.java
IPlayerCheckService.java
IPlayerService.java
ISalesService.java
Adapters
MernisServiceAdapter.java
Concrete
CampaignManager.java
MarioPlayerManager.java
PlayerCheckManager.java
SalesManager.java
SonicPlayerManager.java
Entities
Campaign.java
Player.java
Products.java
Game
Game.java
MernisServiceReference
KPSPublic.java
KPSPublicLocator.java
KPSPublicSoap.java
KPSPublicSoapProxy.java
KPSPublicSoapStub.java
Main
Main.java
Contributors
List of contributors goes here.

License
This project is licensed under the MIT License.
