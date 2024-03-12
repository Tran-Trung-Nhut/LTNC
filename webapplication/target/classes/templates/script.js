window.onload = function() {
    axios.get('/listdriver')
        .then(function(response) {
            const drivers = response.data;
            const driverList = document.getElementById('driver-list');
            
            drivers.forEach(function(driver) {
                const listItem = document.createElement('li');
                listItem.innerHTML = `<p>Name: ${driver.name}</p><p>Personal ID: ${driver.personal_ID}</p><p>Sex: ${driver.sex}</p>`;
                driverList.appendChild(listItem);
            });
        })
        .catch(function(error) {
            console.error('Error fetching driver list:', error);
        });
};