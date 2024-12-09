def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "730335555354"
        case 'qa':
            return "730335555354"
        case 'uat':
            return "730335555354"
        case 'pre-prod':
            return "730335555354"
        case 'prod':
            return "730335555354"
        default:
            return "nothing"
    } 
}