cd "D:\eclipse_oxygen\ws-runtime-dissvali\data.bpmn.models\_ignore\Roman org"
get-childItem -recurse -File *.bpmn | ForEach-Object {
    $dir = "D:\eclipse_oxygen\ws-runtime-dissvali\data.bpmn.models\_ignore\Roman flat\$($_.name)"
    if(Test-Path $dir -PathType Container) { # only works, if there are at most 2 models with the same name
        $dir = "$($dir)2"
        write-host $dir
    }
    new-item -Path $dir -ItemType directory
    copy-item -Path $_.Fullname -Destination $dir
}
