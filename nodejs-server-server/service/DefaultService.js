'use strict';


/**
 * Returns a greeting to the user!
 *
 * user String The name of the user to greet.
 * returns String
 **/
exports.helloUserGET = function(user) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "bytes": [],
  "empty": true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

