# Weather App 🌦️

Weather App built using **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend. It allows users to check the current weather conditions for any city using the OpenWeather API.

## Features

- Fetches real-time weather data for any city.
- Displays temperature and weather description.
- Simple, responsive frontend UI.
- Backend powered by Spring Boot.
- Utilizes OpenWeather API for weather data.

---

## Prerequisites

Before running this project, ensure you have the following installed on your machine:

1. **Java** 
2. **Maven** 
3. **Spring Boot** 
4. **OpenWeather API key**
---

## Getting Started

### 1. **Clone the Repository**

Start by cloning this repository to your local machine:

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```
### 2. Set Up the Backend


Ensure that Maven is installed by running:

```bash
mvn -v
```

### Install Dependencies:

Navigate to the root directory of the project and run the following command to install all required dependencies:

```bash
mvn clean install
```

### 3. Configure API Key

The app uses the OpenWeather API to fetch weather data. You need to configure your API key in the application.properties file.

Open the src/main/resources/application.properties file and get OpenWeather API key:

```properties
weather.api.key=api_key_here
```

### 4. Run the Application
Once everything is set up, run the Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

The app will run on http://localhost:8080.

