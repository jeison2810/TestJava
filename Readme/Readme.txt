1-Ejecutar los scripts de base de datos en SQL server.

2-Probar el método para guardar un usuario.

Utilizar el siguiente método POST http://localhost:8080/api/user/save
{
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez.org",
    "password": "@Hunter2",
    "phones": [
        {
        "number": "1234567",
        "citycode": "1",
        "countrycode": "57"
        }
    ]
}