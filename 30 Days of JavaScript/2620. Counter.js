/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let count = n, i = -1
    return () => count + ++i;
        
    
};
