# Run Locally
`> node server.js`

The server starts on `http://localhost:3000`

---

# Endpoints

- `GET /` => respond with `Hello from Echo Server`
- `GET /echo-server` => respond with `Hello from Echo Server`
- `GET /echo-server?message=test` => responds with `Hello from test`

---

# Using Docker
Run `docker pull docker pull yelhady/echo-server-express:latest`. <br/>
Then, `docker run -d -p 3000:3000 yelhady/echo-server-express:latest`