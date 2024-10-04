# Spring Boot REST API for Movies, Genres, Directors, and Actors

This project is a Spring Boot REST API that provides functionality to manage movies, genres, directors, and actors. The default port for this application is **8080**.

## Running the Application

### Prerequisites
- Java 21
- Maven

### Steps to Run

1. **Clone the repository**:
   ```sh
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```sh
   cd <project-directory>
   ```

3. **Build and run the project**:

   Using Maven, you can build and run the application with the following command:
   ```sh
   mvn spring-boot:run
   ```

   Alternatively, you can run the built JAR file:
   ```sh
   mvn clean install
   java -jar target/<project-name>.jar
   ```

4. **Access the application**:

   Once the application is running, it will be available at:
   ```
   http://localhost:8080
   ```

## Swagger API Documentation

Once the application is running, detailed documentation and a testing UI for the API can be accessed at:

```
http://localhost:8080/swagger-ui/index.html#/
```

This documentation allows you to view all available endpoints, their respective request and response formats, and interact with them directly.

## API Endpoints

The API provides the following endpoints, grouped by resource types:

### Movie Controller
- `GET /api/movies/{id}`: Get a specific movie by its ID.
- `PUT /api/movies/{id}`: Update an existing movie by its ID.
- `DELETE /api/movies/{id}`: Delete a movie by its ID.
- `GET /api/movies`: Get a list of all movies.
- `POST /api/movies`: Create a new movie.

### Genre Controller
- `GET /api/genres/{id}`: Get a specific genre by its ID.
- `PUT /api/genres/{id}`: Update an existing genre by its ID.
- `DELETE /api/genres/{id}`: Delete a genre by its ID.
- `GET /api/genres`: Get a list of all genres.
- `POST /api/genres`: Create a new genre.

### Director Controller
- `GET /api/directors/{id}`: Get a specific director by their ID.
- `PUT /api/directors/{id}`: Update an existing director by their ID.
- `DELETE /api/directors/{id}`: Delete a director by their ID.
- `GET /api/directors`: Get a list of all directors.
- `POST /api/directors`: Create a new director.

### Actor Controller
- `GET /api/actors/{id}`: Get a specific actor by their ID.
- `PUT /api/actors/{id}`: Update an existing actor by their ID.
- `DELETE /api/actors/{id}`: Delete an actor by their ID.
- `GET /api/actors`: Get a list of all actors.
- `POST /api/actors`: Create a new actor.



## Default Port

The default port for this Spring Boot application is **8080**. If necessary, you can change the port by updating the `application.properties` file as follows:

```properties
server.port=8080
```

## Technologies Used
- **Spring Boot**
- **Swagger** for API documentation
- **Maven** for dependency management
- **Java 21**

## License
This project is licensed under the MIT License.
