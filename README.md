## Cache with Redis and MySQL in Springboot
Database in project H2 DataBase

## Before running
Install Redis and start Redis Service

## Demo
### First Run: 
http://localhost:8080/api/v1/users/1 <br>
Time query: 282ms
<img width="1015" alt="Ảnh màn hình 2024-01-27 lúc 18 39 05" src="https://github.com/tranquanghuy-09/CacheWithRedisAndMySQL-Springboot/assets/107989088/63dfa21e-6d16-499c-94c1-5ec2092a2d41">
### Second Run: Time query reduce
http://localhost:8080/api/v1/users/1 <br>
Time query: 10ms
<img width="1015" alt="Ảnh màn hình 2024-01-27 lúc 18 40 08" src="https://github.com/tranquanghuy-09/CacheWithRedisAndMySQL-Springboot/assets/107989088/761ae0d0-14cf-46d2-a2e7-bcbb0dcbe5c8">

