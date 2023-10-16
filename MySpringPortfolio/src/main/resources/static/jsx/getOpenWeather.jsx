/**
 * 
 */
import React, { useState, useEffect } from 'react';

function WeatherComponent() {
  const [temperature, setTemperature] = useState(null);

  useEffect(() => {
    const apiKey = 'YOUR_API_KEY';
    const latitude = 35.68;
    const longitude = 139.76;
    const apiUrl = `http://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=${apiKey}`;

    fetch(apiUrl)
      .then(response => response.json())
      .then(data => {
        const temperature = data.main.temp;
        setTemperature(temperature);
      })
      .catch(error => console.error('Error:', error));
  }, []);

  return (
    <div>
      <p>Temperature: {temperature}°C</p>
    </div>
  );
}

export default WeatherComponent;
