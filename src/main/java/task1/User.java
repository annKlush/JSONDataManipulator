package task1;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String nam;
    private String email;
    private String address;
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private String geo;
    private String lat;
    private String lng;
    private String phone;
    private String website;
    private String company;
    private String catchPhrase;
    private String bs;

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" {\n");
        sb.append("name:'").append(name).append('\'');
        sb.append("username:'").append(username).append('\'');
        sb.append("email:'").append(email).append('\'');
        sb.append("address: {").append('\'');
        sb.append("street:'").append(street).append('\'');
        sb.append("suite:'").append(suite).append('\'');
        sb.append("city:'").append(city).append('\'');
        sb.append("zipcode:'").append(zipcode).append('\'');
        sb.append("geo: {").append('\'');
        sb.append("lat:'").append(lat).append('\'');
        sb.append("lng:'").append(lng).append('\'');
        sb.append("}").append('\'');
        sb.append("},").append('\'');
        sb.append("phone:'").append(phone).append('\'');
        sb.append("website:'").append(website).append('\'');
        sb.append("company: {").append('\'');
        sb.append("nam:'").append(nam).append('\'');
        sb.append("catchPhrase:'").append(catchPhrase).append('\'');
        sb.append("bs:'").append(bs).append('\'');
        sb.append('}').append('\'');
        sb.append('}').append(',').append('\'');
        return sb.toString();
    }

}

//    User user = new User();
//        user.setName("Nicola LaMensh");
//                user.setUsername("KillerDays");
//                user.setEmail("some@gmail.com");
//
//                user.setStreet("Rex Trail");
//                user.setSuite("Suite 280");
//                user.setCity("Howemouth");
//                user.setZipcode("58804-1099");
//
//                user.setLat("24.8918");
//                user.setLng("21.8984");
//
//                user.setPhone("210.067.6132");
//                user.setWebsite("elvis.io");
//
//                user.setNam("JandJ");
//                user.setCatchPhrase("Configurable multimedia task-force");
//                user.setBs("generate enterprise e-tailers");
