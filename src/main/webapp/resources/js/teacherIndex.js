$(function () {
    //判断用户是否登陆
    if("${teachersession}"==""){
        location.href="/teacher/toTeacherLogin"
    }else{
        // 通过session获取用户的信息
        $(function () {
            $("input[name='tno']").val("${teachersession.teacherTno}");
            $("input[name='name']").val("${teachersession.teacherName}");
            $("input[name='jobTitle']").val("${teachersession.teacherJobTitle}");
            $("input[name='profession']").val("${teachersession.teacherProfession}");
            $("input[name='apartment']").val("${teachersession.teacherApartment}");
        })
    }

    layui.use(['element','form','upload'], function(){
        var form = layui.form;
        var upload = layui.upload;
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#test1',
            url: '/course/insertCourse',
            auto:false,
            method:'post',
            bindAction:'#put'
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
                console.log($("input[name='courseName']").val())
                this.data={courseName:$("input[name='courseName']").val(),
                    classes:$("select[name='classes']").val()
                };
            }
            ,done: function(res){
                //如果上传失败
                if(res.code < 0){
                    return layer.msg('添加失败');
                }else{
                    layer.msg('添加成功');
                }
            }
        });

        //添加课程
        $("#add").click(function() {
            layer.open({
                id:1,
                type: 1,
                title: ['添加课程', 'font-size:18px;'],
                skin:'layui-layer-molv',
                anim: 1,
                area:['350px','440px'],
                content: $("#addcourse")
            });
        })
    });
})