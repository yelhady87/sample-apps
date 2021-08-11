# Run Locally
`> ./gradlew bootRun`

The server starts on `http://localhost:8080`

---

# Endpoints

- `GET /greeting` => returns a JSON object with a message "Hello World!"
- `GET /greeting?name=test` => returns a JSON object with a message "Hello Test!"

- `GET /todo/items` => returns an existing list of items
- `GET /todo/items/1` => returns an existing item with the id 1
- `POST /todo/items` => creates an item with the following JSON as a request body <br/> 
    `{ "title": "test title", "description": "test desc" }`

---

# Using Docker
Run `docker pull yelhady/todo-spring-boot-web:latest`. <br/>
Then, `docker run -d -p 4000:8080 yelhady/todo-spring-boot-web:latest`