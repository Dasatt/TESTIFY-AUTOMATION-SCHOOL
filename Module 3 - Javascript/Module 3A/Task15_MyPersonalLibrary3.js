//Create a book array with each book entry as an object. Log books where reading status is true

const books =[ 
    {   
        title: 'My Javascript Book 1 ',
        description: 'This is Book 1 describing how to write javascript for beginners',
        numberOfPages: 22,
        author: 'Oluyemisi Akinboboye',
        reading: false
    },
    {
        title: 'My Javascript Book 2',
        description: 'This is Book 1 describing how to write javascript for beginners',
        numberOfPages: 202,
        author: 'Teniola Akinboboye',
        reading: true,
    },
    {
        title: 'My Javascript Book 3',
        description: 'This is Book 3 describing how to write javascript for beginners',
        numberOfPages: 122,
        author: 'Eniola Akinboboye',
        reading: false,
    },
    {
        title: 'My Javascript Book 4',
        description: 'This is Book 4 describing how to write javascript for beginners',
        numberOfPages: 32,
        author: 'Olamide Akinboboye',
        reading: true,
    },
    {
        title: 'My Javascript Book 5',
        description: 'This is Book 5 describing how to write javascript for beginners',
        numberOfPages: 52,
        author: 'Monijesu Akinboboye',
        reading: true,
    }

]


for (let book=0; book<books.length; book++){
    let bookEntry = books[book]
    if (bookEntry.reading === true){
        console.log(bookEntry)
    }
    
}