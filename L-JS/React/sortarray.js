// Filter data based on my_item with a value of 1, selecting the first 10 entries without order
props.filter((item) => item.my_item === 1).slice(0, 10)
// Reverse data order, filter based on my_item with a value of 1 and select the 10 most recent entries
props.reverse().filter((item) => item.my_item === 1).slice(0, 10)
// Filter and sort data based on my_item with a value of 1, selecting the 10 most recent entries by id
props.filter((item) => item.my_item === 1).sort((a, b) => b.id - a.id).slice(0, 10)
