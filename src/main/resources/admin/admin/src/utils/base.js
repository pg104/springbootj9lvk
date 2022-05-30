const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootj9lvk/",
            name: "springbootj9lvk",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootj9lvk/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线投稿系统"
        } 
    }
}
export default base
