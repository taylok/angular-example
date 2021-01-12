Angular: 9.1.13
```
From project root
ng new angular-example --directory=src/main/ui --style=css --routing=true --dry-run=true
ng new angular-example --directory=src/main/ui --style=css --routing=true
---
cd src/main/ui
ng g class model/user       ;User model class
ng g service app            ;User service
ng g component users --flat ;users component in same directory as app
```
Modify HTML and Typescript compontent for app and user components
proxy.config.json creates proxy to http://localhost:8080
angular.json is made aware of the proxy
app.component.ts OnInit runs the getUsers service (path /api/users) so is proxied to the SpringBoot host

In development run 
```
(src/main/ui)
ng serve
http://localhost:4200 
```
