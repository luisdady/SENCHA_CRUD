var gridCursos;
Ext.onReady(function() {
      Ext.define('cursoModel', {//se define el modelo
            extend : 'Ext.data.Model',//los modelos en extjs extienden de Model
            fields : [ {// se declarar todos los elementos que contiene el DTO
                  name : 'id',
                  type : 'int'
            }, {
                  name : 'Cedula',
                  type : 'int'
            }, {
                  name : 'Nombre',
                  type : 'string'
            }]
      });
      var storeCursos = Ext.create('Ext.data.Store', {//este store funciona como un                 arrayList.
           model : 'cursoModel',//referencia al modelo que definimos
            autoLoad : true,
            autoSync : true,
            proxy : {//define las peticiones que se hacen al servidor
                  type : 'ajax',//significa que los recursos que necesitamos estan en el server
                  api : {//se definen los métodos para leer, actualizar y borrar información
                        read : 'cursos'// lee los datos, busca al servlet con el urlpattern cursos
                  },
                  reader : {
                        root : 'cursos'//hace referencia al objeto json que se va a regresar en Java
                  }
            }
      });
      gridCursos = Ext.create('Ext.grid.Panel', {
            title : 'cursos',//nombre del grid
            store : storeCursos,//variable que definimos, su funcioón es realizar la petición al servidor e interactua con el.
            columns : [ {//se deninen los elementos que se encuentar en el DTO
                  text : 'id',
                  dataIndex : 'id'
            }, {
                  text : 'Cedula',
                  dataIndex : 'Cedula'
            }, {
                  text : 'Nombre',
                  dataIndex : 'Nombre'
            }],
            height : 200,
            width : 400
      });
      gridCursos.render("cursos");//referencia al div con id="cursos" del index.jsp
});

