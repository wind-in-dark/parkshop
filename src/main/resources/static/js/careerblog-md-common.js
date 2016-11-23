var mdEditor;

$(function () {
	
    function setMarkDownTheme(themeId, avableThemes, themeArea, callBack) {
        var f, g, h, i, e = $("#" + themeId);
        for (localStorage[themeArea] = avableThemes[0], f = 0, g = avableThemes.length; g > f; f++) h = avableThemes[f], i = localStorage[themeArea] == h ? 'selected="selected"' : "", e.append('<option value="' + h + '"' + i + ">" + h + "</option>");
        
        return e.bind("change", function () {
            var a = $(this).val();
            return "" === a ? !1 : (console.log("lsKey =>", themeArea, a), localStorage[themeArea] = a, callBack(e, a), void 0)
        }), e
    }
    
    mdEditor = editormd("markdown-editor", {
        width: "100%",
        height: 900,
        syncScrolling: "single",
        path: "../lib/",
        imageUpload: !0,
        imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
        imageUploadURL: "/admin/file/uplPic.action",
        saveHTMLToTextarea: !0
    });
    
    setMarkDownTheme("editormd-theme-select", editormd.themes, "theme", function (a, b) {
        mdEditor.setTheme(b)
    });
    
    setMarkDownTheme("editor-area-theme-select", editormd.editorThemes, "editorTheme", function (a, b) {
        mdEditor.setCodeMirrorTheme(b)
    });
    
    setMarkDownTheme("preview-area-theme-select", editormd.previewThemes, "previewTheme", function (a, b) {
        mdEditor.setPreviewTheme(b)
    });
    
    $("#add-blog").bind("click", function () {
        var a = document.forms[0];
        a.action = "/admin/post.action";
        a.method = "post";
        document.blogForm.article.value = $(".markdown-body")[0].innerHTML;
        document.blogForm.md.value = mdEditor.getMarkdown();
        a.submit();
    });
    
    $("#update-blog").bind("click", function () {
        var a = document.forms[0];
        a.action = "/admin/update.action";
        a.method = "post";
        document.blogForm.article.value = $(".markdown-body")[0].innerHTML;
        document.blogForm.md.value = mdEditor.getMarkdown();
        a.submit();
    });
    
    $("#update-resume").bind("click", function () {
        var a = document.forms[0];
        a.action = "/admin/resume.action"; 
        a.method = "post";
        // 调用 markdown 的类，获取 解析后的 html 格式的内容
        document.resumeForm.resume.value = $(".markdown-body")[0].innerHTML;
        // 获取 markdown 解析前的文本
        document.resumeForm.md.value = mdEditor.getMarkdown();
        a.submit();
    })
    

  
    	
    	
});