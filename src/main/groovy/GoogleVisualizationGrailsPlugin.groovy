import grails.plugins.Plugin
/* Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author <a href='mailto:benjamin.muschko@gmail.com'>Benjamin Muschko</a>
 */
class GoogleVisualizationGrailsPlugin extends Plugin {
    def grailsVersion = "3.0.0 > *"
    def author = "Benjamin Muschko"
    def authorEmail = "benjamin.muschko@gmail.com"
    def developers = [[name: "Benjamin Muschko", email: "benjamin.muschko@gmail.com"], [name: "Angel Ruiz Calvo", email: "aruizca@gmail.com"],
            [name: "Mansi Arora", email: "mansi.arora@tothenew.com"], [name: "Uday Pratap Singh", email: "uday.singh@tothenew.com"]]
    def title = "Google Visualization API Plugin"
    def description = 'This is a plugin for Google Visualization API.'
    def documentation = "https://github.com/bmuschko/grails-google-visualization/wiki"
    def license = "APACHE"
    def issueManagement = [system: "github", url: "https://github.com/bmuschko/grails-google-visualization/issues"]
    def scm = [url: "https://github.com/bmuschko/grails-google-visualization"]


    def pluginExcludes = [
            "grails-app/controllers/**"
    ]

    def profiles = ['web']

}
