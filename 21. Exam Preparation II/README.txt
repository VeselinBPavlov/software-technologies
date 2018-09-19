Start MySQL server to listen;

For JavaScript:
1. Create database with name from config.json
2. Start terminal and write "npm install";
3. Configurate IDE and start the project from IDE or from terminal with "npm start".

For PHP:
1. Start terminal and write "composer install";
2. Create database with "php bin/console doctrine:database:create --if-not-exists
3. Import entities with "php bin/console doctrine:schema:update --force";
4. Confurate IDE and start from it or from terminal with "php bin/console server:run".

For Java:
1. Import project with IntelliJ IDE;
2. The project should be Maven;
3. IDE automaticly will take the dependencies;
4. Run from the startup file. IDE will create automaticly database and entities.

For C#:
1. Start the project from "...sln" file;
2. Run from Visual Studio 2017;
3. You shoud have .NET CORE v.2;
4. The IDE automaticly will create database and entities.