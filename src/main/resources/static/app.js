document.getElementById("weatherForm").addEventListener("submit", function (e) {
    e.preventDefault();  // Prevent the form from refreshing the page

    const city = document.getElementById("city").value;

    // Make the request to the backend
    fetch(`/weather?city=${city}`)
        .then(response => response.json())
        .then(data => {
            // Display the weather result
            document.getElementById("result").innerHTML =
                `The temperature in ${city} is ${data.temperature}°C with ${data.description}.`;
        })
        .catch(error => {
            document.getElementById("result").innerHTML =
                "Error fetching weather data. Please try again.";
        });
});
