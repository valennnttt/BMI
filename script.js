let button = document.getElementById('btn');

button.addEventListener('click', () => {
    const tinggi = parseInt(document.getElementById('tinggi').value);
    const berat = parseInt(document.getElementById('berat').value);
    const result = document.getElementById('output');
    let tinggi_status=false, berat_status=false;

    if(tinggi === '' || isNaN(tinggi) || (tinggi <= 0)){
        document.getElementById('tinggi_error').innerHTML = 'Harap Masukan Data';
    }else{
        document.getElementById('tinggi_error').innerHTML = '';
        tinggi_status=true;
    }

    if(berat === '' || isNaN(berat) || (berat <= 0)){
        document.getElementById('berat_error').innerHTML = 'Harap Masukan Data';
    }else{
        document.getElementById('berat_error').innerHTML = '';
        berat_status=true;
    }

    if(tinggi_status && berat_status){
        const bmi = (berat / ((tinggi*tinggi)/10000)).toFixed(2);

        if(bmi < 18.6){
            result.innerHTML = 'Kurang Berat Badan : ' + bmi;
        }else if(bmi >= 18.6 && bmi < 24.9){
            result.innerHTML = 'Normal : ' + bmi;
        }else{
            result.innerHTML = 'Kelebihan Berat Badan : ' + bmi;
        }
    }else{
        alert('Error');
        result.innerHTML = '';
    }
});