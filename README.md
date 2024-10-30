
### Endpoints Table

| Endpoint                                  | Method | Params/Body                   | Response Codes                               | Description               |
|-------------------------------------------|--------|-------------------------------|----------------------------------------------|---------------------------|
| `http://localhost:8080/fruit/add`         | POST   | `{ name, quantityKilograms }` | 200, 400 ("Fruit already exists")            | Adds new fruit.           |
| `http://localhost:8080/fruit/update`      | PUT    | `{ name, quantityKilograms }` | 200, 404 ("No fruit found with name {name}") | Updates an exiting fruit. |
| `http://localhost:8080/fruit/delete/{id}` | DELETE | `{ id }`                      | 200, 404 ("No fruit found with id {id}")     | Deletes a fruit.          |
| `http://localhost:8080/fruit/getOne/{id}` | GET    | `{ id }`                      | 200, 404 ("No fruit found with id {id}")     | Get fruit.                |
| `http://localhost:8080/fruit/getAll`      | GET    | N/A                           | 200                                          | Get all the fruit.        |



### JSON Format

- **Add Fruit.** Request body: 
    ```json
        {
            "name":"Apple",
            "quantityKilograms":2.8
        }
    ```
    Response: `Added fruit with id {id}`


- **Update Fruit.** Request body:
    ```json
        {
            "name":"Apple",
            "quantityKilograms":1.5
        }
    ```
    Response: `Updated fruit with id {id}`


- **Delete Fruit.** Response: `Deleted fruit with id {id}`


- **Get Fruit.** Response:
    ```json
        {
            "id": 1,
            "name":"Apple",
            "quantityKilograms":2.8
        }
    ```
  
- **Get all Fruits.** Response:
    ```json
        [
          {
              "id": 1,
              "name":"Apple",
              "quantityKilograms":2.8
          },
          {
              "id": 2,
              "name":"Banana",
              "quantityKilograms":8.0
          }
        ]
    ```