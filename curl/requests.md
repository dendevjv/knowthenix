## Register new user
```shell script
curl -X POST -H 'Content-Type: application/json' -d @register-data.json http://localhost:8080/user/register
```

## Login using username and password
```shell script
curl -v -X POST -H 'Content-Type: application/json' -d '{"username":"<username>","password":"<password>"}' http://localhost:8080/user/login
```