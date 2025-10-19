# Strapi JSON Microservice (Spring Boot)

Bu proje, **Strapi Headless CMS**'den gelen JSON verilerini alarak
**Spring Boot mikroservisi** üzerinden istemcilere (mobil, web vb.) servis eder.

---

## 🚀 Özellikler
- Strapi API'den JSON verisi alır (`/posts`)
- Token tabanlı güvenli bağlantı (Bearer Auth)
- Spring WebFlux ile non-blocking WebClient
- Mikroservis mimarisi için uygun yapı
- JSON verisini frontend uygulamalara tip güvenli şekilde sunabilir

---

## 🏗️ Teknolojiler
- **Java 21**
- **Spring Boot 3**
- **Spring WebFlux**
- **Lombok**
- **Maven**

---

## ⚙️ Kurulum

### 1️⃣ Strapi'yi çalıştır
```bash
cd my-strapi-project
npm run develop

```


Strapi endpoint örneği:

http://localhost:1337/api/posts

2️⃣ Spring Boot projesini çalıştır
mvn spring-boot:run
-ya da sağa tıkla run de 

Varsayılan olarak uygulama 8080 portunda çalışır.

🔧 Config (application.properties)
server.port=8080
strapi.api.base-url=http://localhost:1337/api
strapi.api.token=YOUR_API_TOKEN_HERE(59ad02087e3c92d14d2fdc2be18600917ff84ee57ecaefd3054563985c8506a2666319d3e1532a61378459d02dffa9f11295b26b633fafa64c96029bdd91e4fe8b285466f113ccc13ca4d1cb346329174be435de0ac5ff23acd2e93ddf4bdaa34c495b29980f2c5b319d856eff1f9099a07f58f3a7b1d16a4bcdccb840cf8058) -->strapi'den aldım


server.port → Spring Boot’un çalışacağı port

strapi.api.base-url → Strapi’nin API base URL’i

strapi.api.token → Strapi API Token (Bearer Auth)
