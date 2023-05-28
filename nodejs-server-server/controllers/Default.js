'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.helloUserGET = function helloUserGET (req, res, next) {
  var user = req.swagger.params['user'].value;
  Default.helloUserGET(user)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
