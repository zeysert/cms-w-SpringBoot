# Strapi JSON Microservice (Spring Boot)

Bu proje, **Strapi Headless CMS**'den gelen JSON verilerini alarak
**Spring Boot mikroservisi** üzerinden istemcilere (mobil, web vb.) servis eder.

---

## 🚀 Özellikler
- Strapi API'den JSON verisi alır (`/posts`)
- Token tabanlı güvenli bağlantı (Bearer Auth)
- Spring WebFlux ile non-blocking WebClient
- Mikroservis mimarisi için uygun yapı
- JSON verisini frontend uygulamalara sunar

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


API endpoint örneği:
http://localhost:1337/api/posts

🔑 Config (application.properties)
server.port=8081
strapi.api.base-url=http://localhost:1337/api
strapi.api.token=YOUR_API_TOKEN_HERE

{"data":[],"meta":{"pagination":{"page":1,"pageSize":25,"pageCount":0,"total":0}}}

