# Study Software Achitecture Week4
Practice week 4 of Software Achitecture and Design subject <br>
<strong>Content:</strong> Cache with Redis and MySQL in Springboot

<h3>FullName: Trần Quang Huy</h3>
<h3>StudentID: 20092731</h3>

# Demo
## First Run: Fetching data from database and save in cache 
http://localhost:8080/api/v1/users/2 <br>
Time query: 120ms
<img width="1440" alt="Ảnh màn hình 2024-03-02 lúc 23 19 42" src="https://github.com/tranquanghuy-09/SoftwareArchitecture-Week4/assets/107989088/08ea57cf-102a-4bd6-9933-0a3a4eb35409">
<br>

### Data is saved in cache with key-value userId-userName
<img width="1424" alt="Ảnh màn hình 2024-03-02 lúc 23 22 36" src="https://github.com/tranquanghuy-09/SoftwareArchitecture-Week4/assets/107989088/c859384f-2e88-4e3d-96d1-cc7734044d98">



## Second Run: Fetching data from cache => Time query reduce
http://localhost:8080/api/v1/users/2 <br>
Time query: 7ms
<img width="1424" alt="Ảnh màn hình 2024-03-02 lúc 23 22 56" src="https://github.com/tranquanghuy-09/SoftwareArchitecture-Week4/assets/107989088/422baba3-08b7-4c75-b3e4-7a3193a855e3">
