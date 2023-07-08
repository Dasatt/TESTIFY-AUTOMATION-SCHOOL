//book object using object literal

const book ={
    title: 'My Javascript Book',
    description: 'This is a book describing how to write javascript for beginners',
    numberOfPages: 22,
    author: 'Oluyemisi Akinboboye',
    reading: false,
    toggleReadingStatus: function(){
        if (this.reading === true){
            this.reading = false
        }else{
            this.reading = true
        }
    } 
}

// console.log(book.numberOfPages)
// console.log(book['author'])

console.log(book.reading)
book.toggleReadingStatus()
console.log(book.reading)