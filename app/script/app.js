'use strict';

/* App Module */

var fgdsbApp = angular.module('fgdsbApp', [
    'ui.ace',
    'ngRoute',
    'ngAnimate',
    'fgdsbControllers',
    'fgdsbServices'
]);

fgdsbApp.config(['$routeProvider', function($routeProvider) {
    $routeProvider.
        when('/problems', {
            templateUrl: 'partials/problems.html',
            controller: 'ProblemListCtrl'
        }).
        when('/addnew/:problemId', {
            templateUrl: 'partials/addnew.html',
            controller: 'AddNewCtrl'
        }).
        when('/submissions/:problemId', {
            templateUrl: 'partials/submissions.html',
            controller: 'SubmissionsCtrl'
        }).
        when('/subdetail/:subid', {
            templateUrl: 'partials/submission-detail.html',
            controller: 'SubDetailCtrl'
        }).
        when('/problems/:problemId', {
            templateUrl: 'partials/problem-detail.html',
            controller: 'ProblemDetailCtrl'
        }).
        otherwise({
            redirectTo: '/problems'
        });
}]);

fgdsbApp.directive('bindHtmlUnsafe', function( $parse, $compile ) {
    return function( $scope, $element, $attrs ) {
        var compile = function( newHTML ) {
            newHTML = $compile(newHTML)($scope);
            $element.html('').append(newHTML);
        };
        var htmlName = $attrs.bindHtmlUnsafe;
        $scope.$watch(htmlName, function( newHTML ) {
            if(!newHTML) return;
            compile(newHTML);
        });
    };
});
