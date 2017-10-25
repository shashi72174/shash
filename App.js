import React, { Component } from 'react';
import './App.css';
import $ from 'jquery';
import BookItem from './BookItem';

class App extends Component {
  constructor() {
    super();

    this.state = {value : []}

  }
  componentWillMount() {

  }
  componentDidMount() {
    var self = this;
      var tabcontent = $('.tabcontent');
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        //document.getElementById("London").style.display = "block";

        $("#tab1").click();
        $("#tab1").focus();
        var tablinks = $('.tablinks');
      for(var i=0;i<tablinks.length;i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
      }

      $("#London").show('fast');
      $("#Paris").hide('fast');
      $("#Tokyo").hide('fast');
      $('#bookTable').remove();

      $.ajax({
        type : 'GET',
        url : 'http://localhost:9090/SpringMVCProject/getBookDetails',
        success : function(data) {
          var data1 = JSON.parse(data);
              self.setState({value : data1.books});
              console.log('this.state.value.length  =====> '+self.state.value.length);

        },
        error: function(requestObject, error, errorThrown) {
                   console.log(error.status);
                   console.log('throwned error =====> '+errorThrown);
        }
      });
  }

  render() {
    var bookItems;
    if(this.state.value) {
					bookItems = this.state.value.map(book => {
					//console.log(project);
					return (<BookItem key = {book.BOOKID} index = {book.BOOKID} book = {book}/>);
					});
				}
    return (<div>
              <h1 align="center">Secure Financial Transaction Regulations</h1>
              <div id="multiTabId" className="tabs" align="center">
                  <button id="tab1" value="Tab1" autoFocus="autofocus" className="tablinks">Tab1</button>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <button id="tab2" value="Tab2" className="tablinks">Tab2</button>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <button id="tab3" value="Tab3" className="tablinks">Tab3</button>
              </div>
                <div id="London" className="tabcontent" align="center">
              		<h3>London</h3>
              		<p>London is the capital city of England.</p>
              		<div id="divId" align="center">
                    <table>
                      <thead>
                          <tr>
                              <th>ISBN</th>
                              <th>BOOKNAME</th>
                              <th>BOOKPRICE</th>
                              <th>EDIT</th>
                           </tr>
                      </thead>
                      <tbody>
                        {bookItems}
                      </tbody>
                    </table>
                  </div>
              	</div>

              	<div id="Paris" className="tabcontent">
              		<h3>Paris</h3>
              		<p>Paris is the capital of France.</p>
              	</div>

              	<div id="Tokyo" className="tabcontent">
              		<h3>Tokyo</h3>
              		<p>Tokyo is the capital of Japan.</p>
              	</div>
            </div>
    );
  }
}

export default App;
