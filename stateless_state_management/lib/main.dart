import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  String _textValue = '';
  void _updatetextFieldValue (String v) {
    _textValue = v;
    print(_textValue);
  }


  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold (
        appBar: AppBar (
          title: Text('State on Stateless Widget '),
        ),
        body: Padding (
          padding: EdgeInsets.all(20.0),
          child: Column (
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: <Widget>[
              TextField(
                onChanged: (value) => _updatetextFieldValue(value),
              ),
              SizedBox(height: 10.0, ),
              Text(_textValue),
            ],
          ),
        ),
      ),
    );
  }


}

