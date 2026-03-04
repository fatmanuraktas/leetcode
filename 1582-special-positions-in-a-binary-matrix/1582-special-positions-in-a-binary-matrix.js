/**
 * @param {number[][]} mat
 * @return {number}
 */
var numSpecial = function(mat) {
    const m = mat.length;
    const n = mat[0].length;
    
    const rowCount = new Array(m).fill(0);
    const colCount = new Array(n).fill(0);
    
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (mat[i][j] === 1) {
                rowCount[i]++;
                colCount[j]++;
            }
        }
    }

    let specialPositions = 0;

    for (let i = 0; i < m; i++) {
        if (rowCount[i] !== 1) continue; 
        for (let j = 0; j < n; j++) {
            if (mat[i][j] === 1 && colCount[j] === 1) {
                specialPositions++;
            }
        }
    }
    
    return specialPositions;
};