// asciidoctor setup:
// download rubyinstaller from https://rubyinstaller.org/ and install it.

// If proxy apply proxy and make sure everything in path settings.
gem install --http-proxy http://147.149.2.7:8080 asciidoctor

asciidoctor --version

gem install --http-proxy http://147.149.2.7:8080 asciidoctor-diagram

asciidoctor -r asciidoctor-diagram E:\Vihar\docs\hsbc\ScheduleBuildAndActivate.adoc --trace


