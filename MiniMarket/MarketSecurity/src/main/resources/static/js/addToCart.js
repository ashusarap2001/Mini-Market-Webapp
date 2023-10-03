// add this file in all html files
// get all forms with add-to-cart-form as class
const forms = document.querySelectorAll('.add-to-cart-form');

forms.forEach(form => {
	form.addEventListener('submit', event => {
		event.preventDefault();

		// get data from form
		const price1 = form.getElementsByClassName('product-price')[0].innerText;
		const name = form.getElementsByClassName('product-name')[0].innerText;
		const quantity = form.getElementsByClassName('product-quantity')[0].value;
		// add product-image-link to image in form
		//const link1 = form.getElementsByClassName('product-image-link')[0].src;
		const link = 'img/atta1.jpg'

   var price = price1.substring(2, 7); 
                 
		console.log('Price : ' + price);
		console.log('Name : ' + name);
		console.log('Quantity : ' + quantity);
		
//Cover price into double
var str = price1.substring(2, 7);
var price_into_integer = parseInt(str); 
var total=price_into_integer*quantity;
console.log('Total : '+ total);

		saveCartItem(price, name, quantity, link,total);
	});
});


// make http request to submit data
async function saveCartItem(price, name, quantity, link,total) {
	const options = {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify({
			name: name,
			price: price,
			quantity: quantity,
			imageLink: link,
			total:total
		})
	};

	await fetch('/api/cart/add', options);
}