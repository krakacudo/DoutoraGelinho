document.addEventListener('DOMContentLoaded', () => {
    const buttonElement = document.getElementById('hello');
    buttonElement.addEventListener('click', () => {
      alert(sum(1+2));
    });
});

const sum = (first, second) => first + second;
