function login(username, password) {
    fetch("https://api.example.com/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            username: username,
            password: password
        })
    })
    .then(response => response.json())
    .then(data => {
        document.cookie = "session=" + data.token;
        localStorage.setItem("userInfo", JSON.stringify(data)); 
    })
    .catch(error => {
        console.log(error); 
    });
}
